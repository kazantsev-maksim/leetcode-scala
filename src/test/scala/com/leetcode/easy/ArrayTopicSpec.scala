package com.leetcode.easy

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import com.leetcode.easy.ArrayTopic.{ generate, plusOne, removeDuplicates, removeElement, singleNumber }

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

  it should "plusOne" in {
    val testCases =
      Seq((Array(1, 2, 3), Array(1, 2, 4)), (Array(4, 3, 2, 1), Array(4, 3, 2, 2)), (Array(9), Array(1, 0)))

    testCases.foreach {
      case (digits, expected) =>
        assertResult(expected)(plusOne(digits))
    }
  }

  it should "singleNumber" in {
    val testCases =
      Seq((Array(2, 2, 1), 1), (Array(4, 1, 2, 1, 2), 4), (Array(1), 1))

    testCases.foreach {
      case (nums, expected) =>
        assertResult(expected)(singleNumber(nums))
    }
  }

  it should "generate" in {
    val testCases =
      Seq(
        (1, List(List(1))),
        (2, List(List(1), List(1, 1))),
        (5, List(List(1), List(1, 1), List(1, 2, 1), List(1, 3, 3, 1), List(1, 4, 6, 4, 1)))
      )
    testCases.foreach {
      case (numRows, expected) =>
        assertResult(expected)(generate(numRows))
    }
  }
}
