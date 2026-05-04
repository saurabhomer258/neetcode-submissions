class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        var result = IntArray(temperatures.size)
        var stack = ArrayDeque<Int>()

        for (i in 0 until temperatures.size)  {

            while (!stack.isEmpty() && temperatures[stack.last()] < temperatures[i] ) {

                var index  =  stack.removeLast()
                result[index] = i - index
            }
            stack.addLast(i)
        }
        return result
    }
}
