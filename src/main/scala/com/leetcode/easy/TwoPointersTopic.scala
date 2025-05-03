package com.leetcode.easy

import scala.annotation.tailrec

object TwoPointersTopic {

  // https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
  def strStr(haystack: String, needle: String): Int = {
    if (needle.length <= haystack.length) {
      var left  = 0
      var right = needle.length
      while (right <= haystack.length) {
        if (haystack.substring(left, right) == needle) {
          return left
        } else {
          left += 1
          right += 1
        }
      }
    }
    -1
  }

  // https://leetcode.com/problems/merge-sorted-array/
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    @tailrec
    def loop(left: Int, right: Int, write: Int): Unit = {
      (left, right, write) match {
        case (_, right, _) if right < 0 => ()
        case (left, right, write) if left >= 0 && nums1(left) > nums2(right) =>
          nums1(write) = nums1(left)
          loop(left - 1, right, write - 1)
        case (left, right, write) =>
          nums1(write) = nums2(right)
          loop(left, right - 1, write - 1)
      }
    }
    loop(m - 1, n - 1, m + n - 1)
  }

}
