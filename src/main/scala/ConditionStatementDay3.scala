object ConditionStatementDay3 {

  def test(N: Int): String = {
    if (N == 1) {
      return "weird"
    } else if (N % 2 != 0) {
      return "weird"
    } else if (5 < N | N < 21) {
      return "weird"
    } else {
      return "not weird"
    }
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val N = stdin.readLine.trim.toInt
    println(test(N))
  }
}
