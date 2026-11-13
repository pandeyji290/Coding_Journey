class Solution(){
  fun removeElement(nums:IntArray,target:Int):Int{
    var i = 0
    for(j in nums.indices){
      if(nums[j] != target){
        nums[i]=nums[j]
        i++
      }
    }
    return i
  }
}
