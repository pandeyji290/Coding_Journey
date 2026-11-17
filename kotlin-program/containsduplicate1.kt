fun containsDuplicate(nums: IntArray): Boolean {

    val map = HashMap<Int, Int>()

    for (i in nums.indices) {

        val number = nums[i]

        if (map.containsKey(number)) {
            return true
        }

        map[number] = 1
    }

    return false
}

fun main() {

    val nums = intArrayOf(1, 2, 3, 1)

    val result = containsDuplicate(nums)

    println("Answer = $result")
}
