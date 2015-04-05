package com.derpbear

object Totaling {
  def totalResultOverRange(number:Int, codeBlock: Int => Int) : Int = {
    var result = 0
    for (i <- 1 to number) {
      result += codeBlock(i)
    }
    result
  }

  def inject(array: Array[Int], initial: Int, operation: (Int, Int) => Int) : Int = {
    var carryOver = initial
    array.foreach(element => carryOver = operation(carryOver, element) )
    carryOver
  }

  def reInject(array: Array[Int], initial: Int)(operation: (Int, Int) => Int) : Int = {
    var carryOver = initial
    array.foreach(element => carryOver = operation(carryOver, element))
    carryOver
  }
}
