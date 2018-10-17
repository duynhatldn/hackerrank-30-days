package object AngryProfessor {
  object Solution {


    def angryProfessor(k: Int, a: Array[Int]): String = {
      if (a.count(_ <= 0) >= k) "NO"
      else "YES"
    }

    def main(args: Array[String]): Unit = {
      val stdin = scala.io.StdIn

      val t = stdin.readLine.trim.toInt

      for (tItr <- 1 to t) {
        val nk = stdin.readLine.split(" ")

        val _ = nk(0).trim.toInt

        val k = nk(1).trim.toInt

        val a = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = angryProfessor(k, a)

        println(result)
      }
    }
  }

}
