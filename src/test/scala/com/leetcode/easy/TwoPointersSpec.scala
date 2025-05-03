package com.leetcode.easy

import com.leetcode.easy.TwoPointersTopic.{ merge, strStr }
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

final class TwoPointersSpec extends AnyFlatSpec with should.Matchers {

  it should "strStr" in {
    val testCases =
      Seq(("sadbutsad", "sad", 0), ("aaa", "aaaaaa", -1), ("fvdsfvsdfvfv", "abc", -1))

    testCases.foreach {
      case (haystack, needle, expected) =>
        assertResult(expected)(strStr(haystack, needle))
    }
  }

  it should "merge" in {
    val testCases = Seq(
      (Array(1, 2, 3, 0, 0, 0), 3, Array(2, 5, 6), 3, Array(1, 2, 2, 3, 5, 6)),
      (Array(1), 1, Array.empty[Int], 0, Array(1)),
      (Array(0), 0, Array(1), 1, Array(1))
    )

    testCases.foreach {
      case (nums1, n, nums2, m, expected) =>
        merge(nums1, m, nums2, n)
        assertResult(expected)(nums1)
    }
  }
}
