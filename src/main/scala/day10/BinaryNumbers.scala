package day10

object BinaryNumbers {

  def convertToBinary(number: Int) : List[Boolean] = {
    val a = number % 2
    val core = number / 2
    if (core == 1) {
      List(true, a == 1)
    } else {
      convertToBinary(core) ++ List(a == 1)
    }
  }

  def count(chars : List[Boolean] ): Int = {
    chars.foldLeft((0,0) : (Int, Int))((result: (Int, Int), b: Boolean) => {
      if (b) {
        if (result._2 + 1 > result._1) {
          (result._2 + 1, result._2 + 1)
        } else {
          (result._1, result._2 + 1)
        }
      } else {
        (result._1, 0)
      }
    })._1
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    var n = stdin.readLine.trim.toInt

    println(count(convertToBinary(n)))
  }
}
