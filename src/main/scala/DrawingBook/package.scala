package object DrawingBook {
  object Solution {

    def pageCount(n: Int, p: Int): Int = {
      val forward = p / 2
      val backward = (if (n % 2 == 0) n - p + 1 else n - p) / 2
      forward min backward

    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val n = stdin.readLine.trim.toInt

      val p = stdin.readLine.trim.toInt

      val result = pageCount(n, p)

      println(result)

    }
  }

}
