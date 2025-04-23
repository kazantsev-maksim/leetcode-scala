package com.leetcode.easy

import com.leetcode.data_structures.ListNode

object RecursionTopic {

  // https://leetcode.com/problems/remove-duplicates-from-sorted-list/
  def deleteDuplicates(node: ListNode): ListNode = {
    if (node == null || node.next == null) {
      return node
    }
    val next = node.next
    if (node.x == next.x)
      deleteDuplicates(next)
    else
      new ListNode(node.x, deleteDuplicates(next))
  }

  // https://leetcode.com/problems/merge-two-sorted-lists/
  def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {
    if (list1 == null)
      return list2
    if (list2 == null)
      return list1
    if (list1.x < list2.x)
      new ListNode(list1.x, mergeTwoLists(list1.next, list2))
    else
      new ListNode(list2.x, mergeTwoLists(list1, list2.next))
  }
}
