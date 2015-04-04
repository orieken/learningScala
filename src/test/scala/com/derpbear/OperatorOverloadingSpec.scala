package com.derpbear

import org.scalatest.{Matchers, FunSpec}

class OperatorOverloadingSpec extends FunSpec with Matchers {

  describe("The Complex Example chapter 3.6") {
    describe("Complex class imaginary numbers") {
      it("overides +() ") {
        val complexNumber = new Complex(1, 2)

        complexNumber.toString() should equal("1+2i")
      }

      it("adds 2 imaginary numbers ") {
        val complexNumber1 = new Complex(1, 2)
        val complexNumber2 = new Complex(2, -3)
        val sum = complexNumber1 + complexNumber2
        val equation = "(" + complexNumber1 + ") + (" + complexNumber2 + ") = " + sum

        equation should equal("(1+2i) + (2-3i) = 3-1i")
        sum.toString() should equal("3-1i")
      }

      it("overides *()") {
        val complexNumber1 = new Complex(1, 4)
        val complexNumber2 = new Complex(2, -3)
        val complexNumber3 = new Complex(2, 2)
        val sum = complexNumber1 + complexNumber2 * complexNumber3

        sum.toString() should equal("11+2i")
      }
    }
  }
}
