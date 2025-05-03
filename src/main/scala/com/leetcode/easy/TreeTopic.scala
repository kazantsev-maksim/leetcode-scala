package com.leetcode.easy

import com.leetcode.data_structures.TreeNode

object TreeTopic {

  // https://leetcode.com/problems/same-tree/
  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    if (p == null && q == null)
      return true
    if (p == null ^ q == null)
      return false
    p.value == q.value && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
  }
}
