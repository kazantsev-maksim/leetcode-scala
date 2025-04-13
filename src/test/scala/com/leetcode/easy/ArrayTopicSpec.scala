package com.leetcode.easy

import com.leetcode.easy.ArrayTopic.{ removeDuplicates, removeElement }
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

final class ArrayTopicSpec extends AnyFlatSpec with should.Matchers {

  it should "removeElement" in {
    val testCases =
      Seq((Array(3, 2, 2, 3), 3, 2), (Array(0, 1, 2, 2, 3, 0, 4, 2), 2, 5))

    testCases.foreach {
      case (nums, value, expected) =>
        assertResult(expected)(removeElement(nums, value))
    }
  }

  it should "removeDuplicates" in {
    val testCases =
      Seq((Array(1, 1, 2), 2), (Array(0, 0, 1, 1, 1, 2, 2, 3, 3, 4), 5))

    testCases.foreach {
      case (nums, expected) =>
        assertResult(expected)(removeDuplicates(nums))
    }
  }
}
