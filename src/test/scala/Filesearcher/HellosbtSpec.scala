package Filesearcher

import org.scalatest.{FunSpec, Matchers}

class HellosbtSpec extends FunSpec with Matchers {

  describe("Hellosbt") {
    it("responds to #sayHi()") {
      val example = new Hellosbt

      "example.sayHi()" should compile
    }
  }

}
