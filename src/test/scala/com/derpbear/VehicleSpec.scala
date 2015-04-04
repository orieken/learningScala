package com.derpbear

import org.scalatest.{FunSpec, Matchers}

class VehicleSpec extends FunSpec with Matchers {

  describe("Vehicle") {
    it("overrides toString() and returns the car details") {
      val vehicle = new Vehicle(10, 2015)

      vehicle.toString should equal("ID: 10, Year: 2015")
    }
  }
}
