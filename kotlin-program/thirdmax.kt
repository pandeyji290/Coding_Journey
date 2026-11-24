fun thirdMax(nums: IntArray): Int {
    var first = Long.MIN_VALUE
    var second = Long.MIN_VALUE
    var third = Long.MIN_VALUE

    for (i in nums.indices) {
        val num = nums[i].toLong()

        if (num == first || num == second || num == third) {
            continue
        }

        if (num > first) {
            third = second
            second = first
            first = num
        } else if (num > second) {
            third = second
            second = num
        } else if (num > third) {
            third = num
        }
    }

    if (third == Long.MIN_VALUE) {
        return first.toInt()
    }

    return third.toInt()
}

fun main() {
    val nums = intArrayOf(3, 2, 1)

    val answer = thirdMax(nums)

    println("Third maximum = $answer")
}