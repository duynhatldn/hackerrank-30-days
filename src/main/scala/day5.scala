object day5 {
  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt
    var a = 0
    for (a <- 1 to 10) {
      println(n + " x " + a + " = " + a * n)
    }
  }
}
