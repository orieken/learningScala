package com.derpbear

import org.scalatest.{FunSpec, Matchers}

class CrayonSpec extends FunSpec with Matchers {
  describe("Crayon") {
    it("has Primary colors") {
      Crayon.primaryColors should equal ("red, green, blue")
    }

    it("gives me a Blue Crayon") {
      Crayon("red").toString() should equal ("Crayon color is red")
    }

    it("is null for unknown crayon color") {
      Crayon("yellow") should be (null)
    }
  }
}
