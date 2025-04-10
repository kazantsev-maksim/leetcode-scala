package com.leetcode.easy

import scala.collection.mutable

object StackTopic {

  // https://leetcode.com/problems/valid-parentheses/
  def isValid(s: String): Boolean = {
    val brackets = mutable.Stack[Char]()
    s.forall {
      case '(' => brackets.push(')'); true
      case '[' => brackets.push(']'); true
      case '{' => brackets.push('}'); true

      case closing if brackets.nonEmpty =>
        brackets.pop() == closing

      case _ => false
    } && brackets.isEmpty
  }
}
