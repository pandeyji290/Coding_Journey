class Solution{
  fun duplicate(nums:IntArray):Int{
  if (nums.isEmpty()) return 0

  var i = 0
  for(j in 1 until nums.size){
    if(nums[j]!=nums[i]){
      i++
      nums[i]=nums[j]
    }
    
  }
  return i + 1
}
}

fun main(){
  val obj = Solution()
  val nums = intArrayOf(1,1,2,2,3,3)
  println(obj.duplicate(nums))
  
}