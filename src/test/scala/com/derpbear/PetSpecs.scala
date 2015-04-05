package com.derpbear

import org.scalatest.{Matchers, FunSpec}

class PetSpecs extends FunSpec with Matchers {
  val dogs = Array(new Dog("Rover"), new Dog("Comet"))

  def workWithPets(pets: Array[Pet]) {}
  def playWithPets[T <: Pet](pets: Array[T]) = "Playing with pets: " + pets.mkString(", ")
  def copyPets[S, D >: S](fromPets: Array[S], toPets: Array[D]) = {}

  describe("Pets") {
    it("workWithPets does not compile") {
      "workWithPets(dogs)" shouldNot compile
    }

    it("playWithPets should return the pets being played with") {
      playWithPets(dogs) should equal ("Playing with pets: Rover, Comet")
    }

    it("copies pets array to dogs array") {
      val pets = new Array[Pet](10)
//      wat not sure how to test this
      copyPets(dogs, pets)

    }
  }
}
