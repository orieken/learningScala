package com.derpbear

import org.scalatest.{Matchers, FunSpec}

class MarkerFactorySpec extends FunSpec with Matchers {
  describe("MarkerFactory") {
    it("#getMarker for known color tells me the color") {
      (MarkerFactory getMarker "blue").toString should equal("marker color blue")
    }
    it("#getMarker for unknown color tells me its null") {
      MarkerFactory getMarker "yellow" shouldBe null
    }
  }
}
