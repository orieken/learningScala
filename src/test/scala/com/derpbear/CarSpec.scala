package com.derpbear

import org.scalatest.{BeforeAndAfterEach, FunSpec, Matchers}

class CarSpec extends FunSpec with Matchers with BeforeAndAfterEach {

  var car: Car = _

  override def beforeEach(): Unit = {
    car = new Car
  }


  describe("Car") {
    describe("Turning") {
      it("Turns left") {
        car turn "left" should equal ("turning ... left")
      }

      it("Turns right") {
        car turn "right" should equal ("turning ... right")
      }
    }
  }

}
