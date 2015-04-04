package com.derpbear

object MarkerFactory {
  private val markers = Map(
  "red" -> new Marker("red"),
  "blue" -> new Marker("blue"),
  "green" -> new Marker("green")
  )

  def getMarker(color: String) = if (markers.contains(color)) markers(color) else null
}
