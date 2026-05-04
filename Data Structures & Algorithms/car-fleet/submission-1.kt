class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
            var cars = position.indices.map { i-> Pair(position[i],speed[i]) }.sortedByDescending { it. first}
            var fleet = 0
            var lastTime = 0.0

            cars.forEach {
                (position,speed) -> 
                var time = (target - position).toDouble()/speed
                if(time > lastTime) {
                    fleet ++
                    lastTime = time
                }
            }
            return fleet
    
    }
}
