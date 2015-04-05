package com.derpbear

import org.scalatest.{Matchers, FunSpec}

class TotalingSpec extends FunSpec with Matchers {
  val numbers = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

  describe("Totaling") {
    describe("#totalResultsOverRange") {
      it("sums up all items in range") {
        val total = Totaling.totalResultOverRange(12, i => i)
        total should equal(78)
      }
      it("sums up all even items in range") {
        val total = Totaling.totalResultOverRange(13, i => if (i % 2 == 0) 1 else 0)
        total should equal(6)
      }
      it("sums up all odd items in range") {
        val total = Totaling.totalResultOverRange(13, i => if (i % 2 != 0) 1 else 0)
        total should equal(7)
      }
    }
    describe("#inject") {
      it("sum of items in array") {
        val sum = Totaling.inject(numbers, 0, (carryOver, element) => carryOver + element)
        sum should equal(78)
      }
      it("gets max value from array") {
        val max = Totaling.inject(numbers, Integer.MIN_VALUE, (carryOver, element) => Math.max(carryOver, element))
        max should equal(12)
      }
      it("doesnt compile if we try to send the function with curlies") {
        "Totaling.inject(numbers, 0) { (carryOver, element) => carryOver + element }" shouldNot compile
      }
    }
    describe("#reInject") {
      it("now works when you curry") {
        val sum = Totaling.reInject(numbers, 0) { (carryOver, element) => carryOver + element }
        sum should equal (78)
      }
    }
    describe("foldLeft method") {
      it("sums item in an array using foldLeft") {
        val sum = (0 /: numbers) { (sum, element) => sum + element }
        sum should equal(78)
      }
      it("gets max item in an array using foldLeft") {
        val max = (Integer.MIN_VALUE /: numbers) { (large, element) => Math.max(large, element) }
        max should equal(12)
      }
    }
  }
}
