class LRUCache(private val capacity: Int) {

    class Node(
        var key: Int,
        var value: Int,
        var prev: Node? = null,
        var next: Node? = null
    )

    private val map = HashMap<Int, Node>()

    private val head = Node(0,0)
    private val tail = Node(0,0)

    init {
        head.next = tail
        tail.prev = head
    }

    fun get(key: Int): Int {
        val node = map[key] ?: return -1
        remove(node)
        insert(node)
        return node.value
    }

    fun put(key: Int, value: Int) {

        if (map.containsKey(key)) {
            remove(map[key]!!)
        }

        val node = Node(key, value)
        map[key] = node
        insert(node)

        if (map.size > capacity) {
            val lru = tail.prev!!
            remove(lru)
            map.remove(lru.key)
        }
    }

    private fun remove(node: Node) {
        node.prev!!.next = node.next
        node.next!!.prev = node.prev
    }

    private fun insert(node: Node) {
        node.next = head.next
        node.prev = head

        head.next!!.prev = node
        head.next = node
    }
}