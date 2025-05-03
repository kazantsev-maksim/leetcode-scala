package com.leetcode.easy

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

import com.leetcode.data_structures.TreeNode
import com.leetcode.easy.TreeTopic.isSameTree

final class TreeTopicSpec extends AnyFlatSpec with should.Matchers {

  it should "isSameTree" in {
    val t1 = new TreeNode(1, new TreeNode(2), new TreeNode(3))
    val t2 = new TreeNode(1, new TreeNode(2), null)

    val testCases = Seq((t1, t1, true), (t1, t2, false))

    testCases.foreach { case (p, q, expected) =>
      assertResult(expected)(isSameTree(p, q))
    }
  }
}
