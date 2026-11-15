class Solution{
  fun single(nums:IntArray):Int{
    var result=0
    for(num in nums){
      result=result xor num
    }
    return result
  }
}
fun main() {

    val obj = Solution()

    val nums = intArrayOf(2, 2, 1)

    val answer = obj.single(nums)

    println(answer)
}