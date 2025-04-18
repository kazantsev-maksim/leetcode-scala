package com.leetcode.easy

import com.leetcode.easy.TwoPointersTopic.strStr
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
}
