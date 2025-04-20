package lectures.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends  App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println(s"Computing $n")
      val res = n * factorial(n-1)
      println(s"Finish computing factorial for $n")
      res
    }
  }
  factorial(10)

  def anotherFactorial(n: Int): BigInt = {

    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)
      // Why this func works with big n ?
      // factHelper() is called as the last expression of its "code path"
      // This allow Scala to use the preserve stack frame and not use other stack frames
      // for recursive calls.
      // this is called: TAIL RECURSION = use recursive call as the LAST EXPRESSION
      // tip: use @tailrec decorator
    }

    factHelper(n, 1)
  }

  //println(factorial(5000)) // crash: Stack overflow
  println(anotherFactorial(5000))


  // SO WHEN YOU NEED LOOP: USE **TAIL** RECURSION

  @tailrec
  def concatString(s: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatString(s, n-1, s + accumulator)

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int, isPrime: Boolean): Boolean = {
      if (!isPrime) false
      else if (t <= 1) true
      else isPrimeUntil(t - 1, n % t != 0 && isPrime)
    }
    isPrimeUntil(n / 2, true)
  }

  def fibonnaciTotalSum(n: Int): BigInt = {
    @tailrec
    def fiboTail(t: Int, acc_minus1: BigInt, acc_minus2: BigInt): BigInt = {
      if (n <= 2) 1
      else if (t == 1) acc_minus2 + acc_minus1 + 2
      else fiboTail(t-1, acc_minus2, acc_minus1 + acc_minus2)
    }
    fiboTail(n, 1, 1)
  }

  //solution:
  def fibonnaci_solution(n: Int): Int = {
    @tailrec
    def fiboTail(i: Int, last: Int, nextToLast: Int): Int =
      if(i >= n) last
      else fiboTail(i + 1, last + nextToLast, last)
    if (n <= 2) 1
    else fiboTail(2, 1, 1)
  }

  println(fibonnaciTotalSum(6))
  println(fibonnaci_solution(6))
}
