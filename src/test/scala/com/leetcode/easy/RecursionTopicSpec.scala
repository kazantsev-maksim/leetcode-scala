package com.leetcode.easy

import com.leetcode.data_structures.{ Asserts, ListNode }
import com.leetcode.easy.RecursionTopic.{ deleteDuplicates, mergeTwoLists }
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

final class RecursionTopicSpec extends AnyFlatSpec with should.Matchers {

  it should "deleteDuplicates" in {
    val source   = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))))
    val expected = new ListNode(1, new ListNode(2, new ListNode(3)))

    val testCases = Seq((source, expected))

    testCases.foreach {
      case (source, expected) =>
        assertResult(true)(Asserts.equalListNodes(deleteDuplicates(source), expected))
    }
  }

  it should "mergeTwoLists" in {
    val list1    = new ListNode(1, new ListNode(2, new ListNode(4)))
    val list2    = new ListNode(1, new ListNode(3, new ListNode(4)))
    val expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))))

    val testCases = Seq((list1, list2, expected))

    testCases.foreach {
      case (list1, list2, expected) =>
        assertResult(true)(Asserts.equalListNodes(mergeTwoLists(list1, list2), expected))
    }
  }
}
