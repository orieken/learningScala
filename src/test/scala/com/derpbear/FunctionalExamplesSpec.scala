package com.derpbear

import org.scalatest.{Matchers, FunSpec}


class FunctionalExamplesSpec extends FunSpec with Matchers {
  val values = List(1, 2, 3, 4, 5, 6)

  describe("Functional Examples") {
    describe("Lists") {
      it("doubles the values of numbers in a list") {
        val doubledValues = values.map(_ * 2)

        doubledValues should equal(List(2, 4, 6, 8, 10, 12))
      }
    }
  }
}
