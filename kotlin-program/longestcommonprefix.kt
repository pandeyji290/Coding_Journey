 class Solution {

    fun longestCommonPrefix(strs: Array<String>): String {
      var ans=strs[0]
      for(i in 1 until strs.size){
        while(!strs[i].startsWith(ans)){
          ans = ans.dropLast(1)
        
        if (ans.isEmpty())  return ""
        }
      }
      return ans
    }

  }
    fun main(){
    val obj=Solution()
    val strs=arrayOf("flower","flow","flight")
    println(obj.longestCommonPrefix(strs))
}      