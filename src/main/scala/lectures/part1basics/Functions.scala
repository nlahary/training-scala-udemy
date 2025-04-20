package lectures.part1basics

object Functions extends App {

  def foo(a: String, b: Int): String = {
    a + " " + b
  }
  // calling a func is an expression

  def foo2: Int = 42

  println(foo("test", 42))
  println(foo2)

  def aRepeatedFunc(a: String, n: Int): String = {
    if (n==1) a
    else a + aRepeatedFunc(a, n-1)
  }
  print(aRepeatedFunc("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSIVE FUNCTION:

  def aFunctionWithSideEffects(a: String): Unit = println(a)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a +b

    aSmallerFunction(n, n-1)
  }


  // Ex
  def greeting(name: String, age: Int): String =
    s"Hi, my name is $name and I am $age yo"


  def factorial(n: Int): Int =
    if(n <= 1) 1 else n*factorial(n-1)


  def fibonnaci(n: Int): Int =
    if(n <= 2) 1
    else fibonnaci(n-1) + fibonnaci(n-2)


  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)

  }

  println(greeting("Nath", 23))
  println(factorial(4))
  println(fibonnaci(5))
  println(isPrime(17))
  println(isPrime(17 * 7))

}
