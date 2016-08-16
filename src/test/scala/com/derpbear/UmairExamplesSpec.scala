package com.derpbear

import org.scalatest.{FunSpec, Matchers}

/**
  * Created by orieken on 8/16/16.
  */
class UmairExamplesSpec extends FunSpec with Matchers {
  val myRegex = "\"id\":\".*\",".r
  val responseBody = s"""{"id":"5f77eff7-2a15-4bcf-831c-b8c1352cc947","href":"https://blah.com/searches/id/5f77eff7-2a15-4bcf-831c-b8c1352cc947”}"""

  describe("Regex Match") {
    it("captures string with id") {
      val myCapture = myRegex.findFirstIn(responseBody)
      val thingsToRemove = "\",".toSet
      val id = myCapture.get.split(":").last.filterNot(thingsToRemove)
      id should equal("5f77eff7-2a15-4bcf-831c-b8c1352cc947")
    }
  }
}
