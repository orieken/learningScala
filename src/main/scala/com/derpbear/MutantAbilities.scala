package com.derpbear

object MutantAbilities {
  def viewMutantAbilities(person: Person) = {
    person match {
      case Human(firstName,lastName) => firstName + " "+ lastName + " - has no super Powers"
      case Mutant(firstName,lastName, ability) => firstName + " "+ lastName + " - level " + ability.powerLevel + " " +
        ability.ability
    }
  }

}
