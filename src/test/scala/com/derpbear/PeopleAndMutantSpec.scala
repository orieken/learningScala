package com.derpbear

import org.scalatest.{FunSpec, Matchers}

class PeopleAndMutantSpec extends FunSpec with Matchers {

  describe("Humans") {
    it("have no Super Powers") {
      val john = Human("John", "Doe")

      MutantAbilities.viewMutantAbilities(john) should equal("John Doe - has no super Powers")
    }
  }

  describe("Mutants") {
    it("have super powers") {
      val wade = Mutant("Wade", "Wilson", SuperPower("Health Regeneration", 1000))

      MutantAbilities.viewMutantAbilities(wade) should equal("Wade Wilson - level 1000 Health Regeneration")
    }
  }
}