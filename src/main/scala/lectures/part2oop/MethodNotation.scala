package lectures.part2oop

import scala.language.postfixOps

object MethodNotation extends App {

  class Person(
                val name: String,
                favoriteMovie: String,
              ) {

    def likes(movie: String) = movie == favoriteMovie

    def +(person: Person) = s"${this.name} hangs out with ${person.name}"
    def unary_! : String = s"$name wtf!?" // don't forget extra space after method's name
    def isAlive: Boolean = true
    def apply(): String = s"hi $name"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // infix notation = operator notation
  val tom = new Person("Tom", "Fight Club")
  println(tom + mary)
  println(1 + 1)
  // ALL OPERATORS ARE METHODS

  // prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_- // + - ~

  println(!mary)

  // postfix notation (method with parameter)
  println(mary.isAlive)
  println(mary isAlive) // not useful

  // apply: method with parentheses + string return type
  println(mary.apply())
  println(mary()) // equivalent
}
