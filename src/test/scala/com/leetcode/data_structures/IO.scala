package com.leetcode.data_structures

object IO {

  def printListNode(head: ListNode): Unit = {
    val output = Seq.newBuilder[Int]

    var it = head
    while (it != null) {
      output.addOne(it.x)
      it = it.next
    }
    println(output.result().mkString(", "))
  }
}
