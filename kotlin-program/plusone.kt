class Solution{
  fun plus(nums:IntArray):IntArray{
    for(i in nums.size -1 downTo 1){
      if(nums[i]<9){
        nums[i]++
        return nums
      }
      nums[i]=0
    }
    return intArrayOf(1) + nums
  }
}