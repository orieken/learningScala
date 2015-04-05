package com.derpbear

import org.scalatest.{Matchers, FunSpec}

class EquipmentSpec extends FunSpec with Matchers {
  describe("Equipment") {
    describe("#simulate()") {
      it("simulate(6) returns calc with 6") {
        def calculator(input: Int) = { input }
        val equipment = new Equipment(calculator)
        equipment.simulate(6) should equal ("calc with 6")
      }
    }
  }
}
