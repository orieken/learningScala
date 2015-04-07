package com.derpbear

import org.scalatest.{Matchers, FunSpec}

class PositionalNotationsForParametersSpec extends FunSpec with Matchers {
  val numbersArray = Array(1, 2, 3, 4, 5, 6)

  describe("Underscore Notations") {
    it("uses underscores instead of creating parameters") {
//      before we used:
//      (0 /: numbersArray) { (sum, element) =>  sum + element
      val sum = (0 /: numbersArray) { _ + _}
      sum should equal (21)
    }
  }

}
