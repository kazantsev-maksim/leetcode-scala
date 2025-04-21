package com.leetcode.easy

import scala.collection.mutable

object ArrayTopic {

  // https://leetcode.com/problems/remove-element/
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    var left     = 0
    var right    = nums.length - 1
    var valCount = 0
    while (left <= right) {
      if (nums(left) != `val`) {
        left += 1
      } else {
        if (nums(right) != `val`) {
          val buffer = nums(left)
          nums(left) = nums(right)
          nums(right) = buffer
          left += 1
        }
        right -= 1
        valCount += 1
      }
    }
    nums.length - valCount
  }

  // https://leetcode.com/problems/remove-duplicates-from-sorted-array/
  def removeDuplicates(nums: Array[Int]): Int = {
    if (nums.isEmpty) return 0
    var i = 0
    for (j <- 1 until nums.length) {
      if (nums(i) != nums(j)) {
        i += 1
        nums(i) = nums(j)
      }
    }
    i + 1
  }

  // https://leetcode.com/problems/plus-one/
  def plusOne(digits: Array[Int]): Array[Int] = {
    var it = digits.length - 1
    while (it >= 0) {
      digits(it) += 1
      if (digits(it) < 10)
        return digits
      if (digits(it) == 10)
        digits(it) = 0
      it -= 1
    }
    if (digits(0) == 0)
      return Array(1) ++ digits
    digits
  }
}
