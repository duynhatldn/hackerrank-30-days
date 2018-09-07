package day9

object Recursion {
  def factorial(n: Int): Int = {
    var a : Int = 1
    for (i<- 1 to n){
      a = a*i
    }
    return a
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    val result = factorial(n)

    println(result)


  }

}
