package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala."

  // Java utilities
  println(str.charAt(7))
  println(str.substring(7))
  println(str.substring(7, 20))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "_"))
  println(str.toLowerCase)
  println(str.length)

  // Scala utilities
  println(str.reverse)
  println(str.take(6)) // Hello

  // s-interpolators
  val name = "Nathanaël"
  val age = 23
  val greeting = s"Hello, my name is $name and I'm almost ${age + 1} yo."
  println(greeting)

  // f-interpolators
  val speed = 1.2f // f for Float instead of Double
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  // raw-interpolators
  println(raw"This is a \n newLine ")
  var escaped = "This is a \n newLine "
  println(raw"$escaped")

}
