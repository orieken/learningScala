package com.derpbear

class Truck(override val id: Int, override val year: Int, var fuelLevel: Int) extends Vehicle(id, year) {
  override def toString: String = super.toString() + ", Fuel Level: " + fuelLevel
}
