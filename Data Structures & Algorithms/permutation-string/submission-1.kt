class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if(s1.length > s2.length) return false;
        var s1Length= IntArray(26)
        var s2Length = IntArray(26)
        for( i in 0 until s1.length ){
            s1Length[s1[i] - 'a'] ++;
            s2Length[s2[i] - 'a'] ++;
        }
        if(s1Length.contentEquals(s2Length)) {
            return true
        }
        for(i in s1.length until s2.length) {
            s2Length[s2[i-s1.length] -'a' ]--
            s2Length[s2[i] - 'a']++
            if(s1Length.contentEquals(s2Length)) {
                return true
            }
        }
        return false
    }
}
