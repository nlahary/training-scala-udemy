package lectures.part2oop

object OOPbasics extends App {

  val person = new Person("John", 23)
  // println(person.age) error: Class parameter but NOT a class MEMBER
  println(person.name)
  println(person.x)
  person.greet("Daniel")
  person.greet()

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.isWrittenBy(imposter  ))

  val counter = new Counter
  counter.incr
  counter.incr.incr.incr.incr
  counter.incr(4)
}

// constructor
// class params are not fields, i.e: age
class Person(val name: String, age: Int = 0) {
  // body
  val x = 2 // field

  // method
  def greet(name: String): Unit = println(s"Hi ${this.name} from $name")

  // overloading
  def greet(): Unit = println(s"Hi $name") // name referees to the class field

  // multiple constructor
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
  // No other choice than overload an already existing constructor
  // solution: attribute with default value

}

class Writer(
            val first_name: String,
            val surname: String,
            val year: Int
            ) {

  def full_name(): String = s"$first_name - $surname"
}

class Novel(
           val name: String,
           val year: Int,
           val author: Writer,
           ) {
  def authorAge: Int = year - author.year

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(new_year: Int): Novel = new Novel(name, new_year, author)

}

class Counter(
             val start: Int = 0
             ) {
  def current_count : Int = this.start

  def incr: Counter = {
    println("incrementing")
    new Counter(start + 1)
  } // immutability

  def decr: Counter = {
    println("decrementing")
    new Counter(start - 1)
  }

//  def incr(n: Int): Counter = new Counter(start + n)
//  def decr(n: Int): Counter = new Counter(start - n)

  def incr(n: Int): Counter = {
    if (n <= 0) this
    else incr.incr(n-1)
  }
  def decr(n: Int): Counter = {
    if (n <= 0) this
    else decr.decr(n-1)
  }

}


