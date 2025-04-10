package com.leetcode.easy

import com.leetcode.easy.HashTableTopic.{ twoSum, wordPattern }
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

final class HashTableTopicSpec extends AnyFlatSpec with should.Matchers {

  it should "twoSum" in {
    val testCases =
      Seq((Array(2, 7, 11, 15), 9, Array(0, 1)), (Array(3, 2, 4), 6, Array(1, 2)), (Array(3, 3), 6, Array(0, 1)))

    testCases.foreach {
      case (nums, target, expected) =>
        assertResult(expected)(twoSum(nums, target))
    }
  }

  it should "wordPattern" in {
    val testCases =
      Seq(("abba", "dog cat cat dog", true), ("abba", "dog cat cat fish", false), ("aaaa", "dog cat cat dog", false))

    testCases.foreach {
      case (pattern, s, expected) =>
        assertResult(expected)(wordPattern(pattern, s))
    }
  }
}
