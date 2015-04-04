package com.derpbear

import org.scalatest.{FunSpec, Matchers}

class TruckSpec extends FunSpec with Matchers {
  describe("Truck"){
    describe("overrides Vehicle toString()") {
      it("returns the overridden toString() value") {
        val truck = new Truck(1, 2009, 100)
        truck.toString() should equal ("ID: 1, Year: 2009, Fuel Level: 100")
      }

    }

  }

}
