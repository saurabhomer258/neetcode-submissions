class Solution {

    fun encode(strs: List<String>): String {
            var result = StringBuilder()
            for(s in strs) {
                result.append(s.length)
                result.append("#")
                result.append(s)
            }
            return result.toString()
    }

    fun decode(str: String): List<String> {
        if(str.isEmpty()) {
            return mutableListOf<String>()
        }
            var res = mutableListOf<String>()
            var i = 0
           while(i < str.length) {
             var j = i
             while(str[j] != '#') {
                j++
             }
             var count = str.substring(i,j).toInt()
              var subs= str.substring(j+1, j+ count +1 )
              res.add(subs)
              i =  j+ count +1
           }
           
        return res
    }
}
