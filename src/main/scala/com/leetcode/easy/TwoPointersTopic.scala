package com.leetcode.easy

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

}
