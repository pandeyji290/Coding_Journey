fun majorityelement(nums:IntArray):Int{
  var candidate=nums[0]
  var count=0
  for(i in nums.indices){
    if(count==0){
      candidate=nums[i]
      
    }
    if(nums[i]==candidate){
      count++
      
    } else{
      count--
    }
    
  }
  return candidate
}

fun main() {

    val nums = intArrayOf(3, 2, 3)

    val answer = majorityelement(nums)

    println("Majority Element = $answer")
}