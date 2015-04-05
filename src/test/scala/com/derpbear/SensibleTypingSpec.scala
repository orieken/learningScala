package com.derpbear

import java.util
import java.util._

import org.scalatest.{Matchers, FunSpec}

class SensibleTypingSpec extends FunSpec with Matchers {
  describe("Typing") {
    describe("defining an Int") {
      it("var year: Int") {
        var year: Int = 2009
        year shouldBe an [Integer]
      }
      it("var anotherYear = 2009") {
        var anotherYear = 2009
        anotherYear shouldBe an [Integer]
      }
    }

    describe("String") {
      it("var greet = 'Hello there'") {
        var greet = "Hello there"
        greet shouldBe a [String]
      }
      it("var builder = new StringBuilder('hello')") {
        var builder = new StringBuilder("hello")
        builder shouldBe a [StringBuilder]
      }
    }

    describe("ArrayList") {
      it("var list = Arraylist, is ArrayList[_]"){
        var list = new ArrayList
        list shouldBe an [ArrayList[_]]
      }
      it("ArrayList[Int] should not equal ArrayList[_]") {
        var list1 = new ArrayList[Int]
        var list2 = new ArrayList

//      They should not compile because they are not the same types
        "list2 = list1" shouldNot compile
      }
      it("ArrayList[Int] should not equal ArrayList[Any]") {
        var list1 = new ArrayList[Int]
        var list2 = new ArrayList[Any]

//      They should not compile because they are not the same types
        "list2 = list1" shouldNot compile
      }
    }
  }


}
