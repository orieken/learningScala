package com.derpbear

import org.scalatest.{Matchers, FunSpec}

/**
 * Created by oscar on 4/3/15.
 */
class StringSpec extends FunSpec with Matchers {


  describe("Strings") {
    it("capitalizes a string") {
      val myString = "hello"

      myString.capitalize should equal("Hello")
    }

    it("can count the length() for me") {
      val str =
        """In his famous inaugural speech, John F. Kennedy said
          "And so, my fellow Americans: ask not what your country can do
          for you-ask what you can do for your country." He then proceeded
          to speak to the citizens of the World..."""

      str.length() should equal(251)
    }

    describe("equality") {
      val exampleString1 = "hello"
      val exampleString2 = "hello"
      val exampleString3 = new String("hello")

      it("string 1 and 2 are ==") {
        exampleString1 == exampleString2 should be (true)
      }

      it("string 1 and 2 are eq") {
        exampleString1 eq exampleString2 should be (true)
      }

      it("string 1 and 3 are ==") {
        exampleString1 == exampleString3 should be (true)
      }

      it("string 1 and 3 are not eq") {
        exampleString1 eq exampleString3 should be (false)
      }
    }
  }

}
