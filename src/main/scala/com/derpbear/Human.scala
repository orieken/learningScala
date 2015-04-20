package com.derpbear

case class Human(first: String, last: String) extends Person
case class Mutant(first: String, last: String, superPower : SuperPower) extends Person
case class SuperPower(ability: String, powerLevel: Int)
