package com.leetcode.easy

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

import com.leetcode.easy.StackTopic._

final class StackTopicSpec extends AnyFlatSpec with should.Matchers {

  it should "isValid" in {
    val testCases = Seq(("()", true), ("()[]{}", true), ("(]", false), ("([])", true))

    testCases.foreach {
      case (s, expected) =>
        assertResult(expected)(isValid(s))
    }
  }
}
