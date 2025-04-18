package com.leetcode.easy

object StringTopic {

  // https://leetcode.com/problems/length-of-last-word/
  def lengthOfLastWord(s: String): Int = {
    val words = s.trim.split(" ")
    words.apply(words.length - 1).length
  }
}
