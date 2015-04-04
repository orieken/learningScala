package com.derpbear

import org.scalatest.{Matchers, FunSpec}

class MicrowaveSpec extends FunSpec with Matchers {

  describe("Using the Microwave") {
    it("throws an error for private functions") {
      val microwave = new Microwave

      "microwave.turnTry()" shouldNot compile
    }
  }

}
