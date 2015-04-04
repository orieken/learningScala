package com.derpbear

import org.scalatest.{BeforeAndAfterEach, FunSpec, Matchers}


class ScalaBasicsSpec extends FunSpec with Matchers with BeforeAndAfterEach {
  var loopsString: String = _

  override def beforeEach(): Unit = {
     loopsString = ""
  }

  describe("Strings") {
  }

  describe("Objects") {
  }

  describe("Looping") {
    it("loops using to() and returns 1, 2, 3, ") {
      for (i <- 1 to 3){ loopsString += (i + ", ") }
      loopsString should equal ("1, 2, 3, ")
    }

    it("loops using until() and returns 1, 2, ") {
      for ( i <- 1 until 3) { loopsString += (i + ", ")}
      loopsString should equal ("1, 2, ")
    }

    it("a more functional loop using foreach() and returns 1, 2, 3, "){
      (1 to 3).foreach(i => loopsString += (i + ", "))
      loopsString should equal ("1, 2, 3, ")
    }
  }
}
