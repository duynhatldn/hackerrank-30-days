package object UtopianTree {
  object Solution {

    def utopianTree(n: Int): Int = {
      var size = 1
      (0 until n).foreach { n =>
        if (n%2==0) size *= 2 else size += 1
      }

      size

    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val t = stdin.readLine.trim.toInt

      for (tItr <- 1 to t) {
        val n = stdin.readLine.trim.toInt

        val result = utopianTree(n)

        println(result)
      }
    }
  }
}
