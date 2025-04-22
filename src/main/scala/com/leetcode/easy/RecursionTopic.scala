package com.leetcode.easy

import com.leetcode.data_structures.ListNode

object RecursionTopic {

  // https://leetcode.com/problems/remove-duplicates-from-sorted-list/
  def deleteDuplicates(node: ListNode): ListNode = {
    if (node == null || node.next == null) {
      return node
    }
    val next = node.next
    if (node.x == next.x) {
      deleteDuplicates(next)
    } else {
      new ListNode(node.x, deleteDuplicates(next))
    }
  }
}
