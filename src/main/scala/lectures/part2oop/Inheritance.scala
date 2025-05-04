package lectures.part2oop

object Inheritance extends App {

  class Animal {
    val creature_type = ""
    def eat = println("miam")
    private def private_eat = println("miam")
    protected def protected_eat = println("miam")
  }

  // inherit only non-private members of super class
  class Cat extends Animal {
    def crunch: Unit = {
      eat
      protected_eat // only accessible within the subclass
      println("crunchcrunch")
    }
  }

  val cat = new Cat
  //cat.eat
  cat.crunch


  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  // will call the constructor of the super class: scala won't compile
//  class Adult(name: String, age: Int, idCart: String) extends Person
  class Adult(name: String, age: Int, idCart: String) extends Person(name)

  // overriding

  // overriding parameter inside constructor = inside class
  class Dog(override val creature_type: String) extends Animal {
    override def eat = {
      super.eat
      println("crunch crunch CRUNCH")
    }
  }

  val dog = new Dog("dog")
  dog.eat

  // type substitution = Polymorphism
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat // still use the Dog's implementation of eat


  // OVERRIDING : Supplying a different implementation in derived class
  // OVERLOADING : Supplying different methods with different signature with the same in the same class

  // Preventing overrides:
  // 1- use final on member
  // 2- use final on the entire class
  // 3- seal the class = extend classes in THIS FILE ONLY
}
