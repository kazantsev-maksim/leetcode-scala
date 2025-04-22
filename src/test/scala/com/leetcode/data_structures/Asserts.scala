package com.leetcode.data_structures

object Asserts {

  def equalListNodes(lhs: ListNode, rhs: ListNode): Boolean = {
    var lhs_next = lhs
    var rhs_next = rhs

    while (lhs_next != null && rhs_next != null) {
      if (lhs_next.x != rhs_next.x)
        return false
      lhs_next = lhs_next.next
      rhs_next = rhs_next.next
    }
    lhs_next == null && rhs_next == null
  }
}
