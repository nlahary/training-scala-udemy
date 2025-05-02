package playground

object ScalaPlayground {
  def main(args: Array[String]): Unit = {
    println("I'm ready to learn Scala!")
  }

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  // The alternatives are objects: they do not receive parameters
  object Person {
    // "Person" is its own type and its only instance
    // "static"/"class" level functionality
    val n_eyes = 2
    def canFly: Boolean = false

    // factory method: return Person
    def apply(mother: Person, father: Person): Person = new Person("bobby")
  }

  class Person(val name: String) {
    //instance-level functionality
  }

  //This pattern (object + class with same name in the same scope) = COMPANIONS

  println(Person.n_eyes)
  println(Person.canFly)

  // Scala object = SINGLETON INSTANCE
  val pierre = Person
  val marie = Person

  println(pierre == marie)

  val mary = new Person("mary")
  val john = new Person("john")

  println(mary == john) // false

  val boby = Person(mary, john)

  // Scala application = Scala object with
  // def main(args: Array[String]): Unit


}
