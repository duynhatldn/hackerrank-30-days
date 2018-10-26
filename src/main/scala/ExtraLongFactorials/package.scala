package object ExtraLongFactorials {
  object Solution {

    def extraLongFactorials(n: Int) {
      println((BigInt(1) to BigInt(n)).reduce(_ * _))

    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val n = stdin.readLine.trim.toInt

      extraLongFactorials(n)
    }
  }
}
