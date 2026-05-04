class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
            var map = HashMap<String,MutableList<String>>()
            for (str in strs) {
                var key = str.toCharArray().sorted().joinToString("")
                 if (!map.containsKey(key)) {
                  map[key] = mutableListOf()
                }
                map[key]!!.add(str)
             }
             return map.values.toList()
    }
}
