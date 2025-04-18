package com.leetcode.easy

import com.leetcode.easy.StringTopic.lengthOfLastWord
import com.leetcode.easy.TwoPointersTopic.strStr
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

final class StringTopicSpec extends AnyFlatSpec with should.Matchers {

  it should "lengthOfLastWord" in {
    val testCases =
      Seq(("Hello World", 5), ("   fly me   to   the moon  ", 4), ("luffy is still joyboy", 6))

    testCases.foreach {
      case (s, expected) =>
        assertResult(expected)(lengthOfLastWord(s))
    }
  }
}
