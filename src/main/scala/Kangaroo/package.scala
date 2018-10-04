package object Kangaroo {
  object Solution {


    def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {
      if (x1 == x2) "YES"
      else if (v2 > v1) kangaroo(x2, v2, x1, v1)
      else {
        if (x1 > x2) "NO"
        else kangaroo(x1 + v1, v1, x2 + v2, v2)
      }
    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val x1V1X2V2 = stdin.readLine.split(" ")

      val x1 = x1V1X2V2(0).trim.toInt

      val v1 = x1V1X2V2(1).trim.toInt

      val x2 = x1V1X2V2(2).trim.toInt

      val v2 = x1V1X2V2(3).trim.toInt

      val result = kangaroo(x1, v1, x2, v2)

      println(result)
    }
  }


}
