package object SaveThePrisoner{
  object Solution {


    def saveThePrisoner(n: Int, m: Int, s: Int): Int = {
      (m - 2 + s) % n + 1


    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val t = stdin.readLine.trim.toInt

      for (tItr <- 1 to t) {
        val nms = stdin.readLine.split(" ")

        val n = nms(0).trim.toInt

        val m = nms(1).trim.toInt

        val s = nms(2).trim.toInt

        val result = saveThePrisoner(n, m, s)

        println(result)
      }
    }
  }

}
