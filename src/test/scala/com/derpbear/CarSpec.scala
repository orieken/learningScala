package com.derpbear

import org.scalatest.{BeforeAndAfterEach, FunSpec, Matchers}

class CarSpec extends FunSpec with Matchers with BeforeAndAfterEach {

  var car: Car = _

  override def beforeEach(): Unit = {
    car = new Car(2013)
  }

  describe("Car") {
    describe("properties") {
      it("was built in 2013") {
        car.year should equal (2013)
      }
    }

    describe("Turning") {
      it("Turns left") {
        car turn "left" should equal ("turning ... left")
      }

      it("Turns right") {
        car turn "right" should equal ("turning ... right")
      }
    }

    describe("Driving") {
      it("has 0 miles") {
        val thisCar = new Car(2013)
        thisCar.miles should equal (0)
      }
      it("has been driven 10 miles") {
        val thisCar = new Car(2015)
        thisCar.drive(10)
        thisCar.miles should equal (10)
      }
    }
  }
}
