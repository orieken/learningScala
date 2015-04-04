package com.derpbear

import org.scalatest.{FunSpec, Matchers}

class MarkerSpec extends FunSpec with Matchers {
  describe("Marker") {
    it("new Marker tells me the color") {
      val marker = new Marker("blue")

      marker.toString should equal("marker color blue")
    }
  }
}