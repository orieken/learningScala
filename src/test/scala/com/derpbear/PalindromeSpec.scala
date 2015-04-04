package com.derpbear

import org.scalatest.{Matchers, FunSpec}


class PalindromeSpec extends FunSpec with Matchers {

  def isPalindrome(word: String) = word == word.reverse.toString()

  describe("palindrome examples"){
    it("is a palindrome"){
      isPalindrome("mom") shouldBe true
    }
    it("is not a palindrome"){
      isPalindrome("dude") shouldBe false
    }
  }

}
