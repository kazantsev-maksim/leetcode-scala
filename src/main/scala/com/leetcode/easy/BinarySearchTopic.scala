package com.leetcode.easy

object BinarySearchTopic {

  // https://leetcode.com/problems/search-insert-position/
  def searchInsert(nums: Array[Int], target: Int): Int = {
    var left  = 0
    var right = nums.length - 1

    while (left <= right) {
      val mid = left + (right - left) / 2
      if (nums(mid) == target) {
        return mid
      } else if (nums(mid) > target) {
        right = mid - 1
      } else {
        left = mid + 1
      }
    }
    left
  }
}
