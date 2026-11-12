fun twosum(nums:IntArray,target:Int):IntArray{
  val map = HashMap<Int,Int>()
  for(i in nums.indices){
    val need = target - nums[i]
    if(map.containsKey(need)){
      return intArrayOf(map[need]!!,i)
    }
    map[nums[i]]=i
  }
  return intArrayOf(1,-1)
}
fun main() {
  val result = twosum(intArrayOf(2,9,11,15),9)
  
    println(result.contentToString())
}