package lectures.part1basics

object Expressions extends App { // Same as adding a main() func

  val x = 1 + 2 // Expression
  println(2 + 3 * 4)
  // + - * / & | ^ >> << >>>

  println(1 == x)
  // == != < > >= <= <
  println(!(1 == x))
  // ! && ||

  var a = 2
  a += 4 // -= *= /=

  // Instructions vs. Expressions

  // Instructions = DO: change a var, print to the console
  // Specific to imperative lang: Python, Java, C..

  // Expressions = VALUE : every bit of code will compute a VALUE (#ScalaWay)

  // IF expression:
  val cond = true
  val condValue = if(cond) 5 else 3 // IF EXPRESSION (NOT INSTRUCTION)
  println(condValue)

  // Loops are discouraged because proper to side effects.
  // side effects: print, whiles, reassigning
  var i = 0
  while(i < 10) {
    println(i)
    i += 1
  }
  // NEVER WRITE THIS AGAIN
  // NO IMPERATIVE CODE IN SCALA
  // EVERYTHING IS AN EXPRESSION IN SCALA

  val WeirdVAlue: Unit = (a = 3) // Unit === Void
  println(WeirdVAlue)
  // SIDE EFFECTS ARE EXPRESSIONS RETURNING Unit


  // code blocks are expression
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }
  // val NotFoundVAlue = z + 1

  val alwaysLastValue = {
    if(aCodeBlock == "hello") 34 else "test"
    42 // w/e happens last value wins
  }

  // Instructions are EXECUTED (java)
  // Expressions are EVALUATED (scala)







}

