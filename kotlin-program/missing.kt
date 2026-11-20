class Solution{
fun missingNumber(nums: IntArray): Int {
    val n = nums.size

    var expectedSum = n * (n + 1) / 2
    var actualSum = 0

    for (i in nums.indices) {
        actualSum += nums[i]
    }

    return expectedSum - actualSum
}
}

fun main() {
    val nums = intArrayOf(3, 0, 1)

    val answer = missingNumber(nums)

    println("Missing number = $answer")
}