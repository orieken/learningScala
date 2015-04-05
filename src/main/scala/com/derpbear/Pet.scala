package com.derpbear


class Pet(val name: String) {
  override def toString = name

}

class Dog(override val name: String) extends Pet(name) {

}