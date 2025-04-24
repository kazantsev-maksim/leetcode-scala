package com.leetcode.easy

import com.leetcode.easy.BinarySearchTopic.searchInsert
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

final class BinarySearchTopicSpec extends AnyFlatSpec with should.Matchers {

  it should "searchInsert" in {
    val testCases =
      Seq((Array(1, 3, 5, 6), 5, 2), (Array(1, 3, 5, 6), 2, 1), (Array(1, 3, 5, 6), 7, 4))

    testCases.foreach {
      case (nums, target, expected) =>
        assertResult(expected)(searchInsert(nums, target))
    }
  }
}
