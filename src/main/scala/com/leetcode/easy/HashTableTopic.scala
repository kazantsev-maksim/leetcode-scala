package com.leetcode.easy

import scala.collection.mutable

object HashTableTopic {

  // https://leetcode.com/problems/two-sum/description/
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val buffer = mutable.HashMap[Int, Int]()
    val output = Array.newBuilder[Int]

    for ((num, i) <- nums.zipWithIndex) {
      buffer.get(num) match {
        case Some(j) => output.addOne(j).addOne(i)
        case None    => buffer.put(target - num, i)
      }
    }
    output.result()
  }

  // https://leetcode.com/problems/word-pattern/
  def wordPattern(pattern: String, s: String): Boolean = {
    val mapping = mutable.HashMap[Char, String]()
    val viewed  = mutable.HashSet[String]()
    val words   = s.split(" ")

    if (words.length != pattern.length) {
      false
    } else {
      words.zip(pattern.toCharArray).forall {
        case (word, pattern) =>
          mapping.get(pattern) match {
            case Some(value)                   => value == word
            case None if viewed.contains(word) => false
            case _ =>
              mapping.put(pattern, word)
              viewed.add(word)
              true
          }
      }
    }
  }

  // https://leetcode.com/problems/roman-to-integer/
  def romanToInt(s: String): Int = {
    if (s.isEmpty) return 0
    lazy val romanSymbolsMapping =
      Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)
    var output = 0
    var prev   = 0
    var it     = s.length - 1
    while (it >= 0) {
      val curr = romanSymbolsMapping(s.charAt(it))
      if (curr >= prev)
        output += curr
      else
        output -= curr
      prev = curr
      it -= 1
    }
    output
  }
}
