package lectures.part1basics

object ValuesVariablesTypes {
  def main(args: Array[String]): Unit = {

    val x: Int = 42 // Vals: immutable
    val y = 42 // Compiler can infer types
    println(x)
    println(y)

    val a: String = "a"
    val bool: Boolean = false
    val char: Char = 'a'
    val sh: Short = 456 // 16bit signed
    val lo: Long  = 1654564664464684L // 64bit signed
    val fl: Float = 2.0 // or 2.0f
    val dou: Double = 3.14


    var variable = 4
    variable += 5

  }



}
