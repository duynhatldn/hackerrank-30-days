package object BirthdayCakeCandles {
  object Solution {
    def birthdayCakeCandles(ar: Array[Int]): Int = {
      val maxElement = ar.max
      ar.count(_ == maxElement)



    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val arCount = stdin.readLine.trim.toInt

      val ar = stdin.readLine.split(" ").map(_.trim.toInt)
      val result = birthdayCakeCandles(ar)

      println(result)

    }
  }
}
