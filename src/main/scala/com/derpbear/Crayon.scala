package com.derpbear

class Crayon private (val color: String) {
  override def toString : String = "Crayon color is " + color
}

object Crayon {
  private val crayons = Map(
  "red" -> new Crayon("red"),
  "blue" -> new Crayon("blue"),
  "green" -> new Crayon("green")
  )

  def primaryColors = "red, green, blue"

  def apply(color: String) = if (crayons.contains(color)) crayons(color) else null
}
