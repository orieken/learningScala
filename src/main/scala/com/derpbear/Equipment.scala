package com.derpbear

class Equipment(val routine : Int => Int) {
  def simulate(input: Int) = {
    "calc with " + routine(input)
  }

}
