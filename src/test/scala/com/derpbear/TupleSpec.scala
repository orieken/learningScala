package com.derpbear

import org.scalatest.{Matchers, FunSpec}

/**
 * Created by oscar on 4/3/15.
 */
class TupleSpec extends FunSpec with Matchers {
  def myTuple = { ("Oscar", "Rieken", "oriekenjr@gmail.com") }
//  a tuple is an immutable object sequence created as comma-separated values
//  like:
//  ("Oscar", "Rieken", "oriekenjr@gmail.com")
  describe("A tuple") {
    it("can be accessed directly") {
      myTuple._1 should equal ("Oscar")
      myTuple._2 should equal ("Rieken")
      myTuple._3 should equal ("oriekenjr@gmail.com")
    }

    it("can be passed to a val") {
      val (firstName, lastName, emailAddress) = myTuple

      firstName should equal ("Oscar")
      lastName should equal ("Rieken")
      emailAddress should equal ("oriekenjr@gmail.com")
    }
  }

}
