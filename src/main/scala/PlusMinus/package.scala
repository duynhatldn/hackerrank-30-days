package object PlusMinus {
  import scala.io.StdIn._
  import scala.annotation.tailrec

  object Solution {
    def plusMinus(arr: Array[Int]) {

      println((BigDecimal(arr.filter(_ > 0).length) / BigDecimal(arr.length)).setScale(6, BigDecimal.RoundingMode.HALF_UP))
      println((BigDecimal(arr.filter(_ < 0).length)/ BigDecimal(arr.length)).setScale(6, BigDecimal.RoundingMode.HALF_UP))
      println((BigDecimal(arr.filter(_ == 0).length)/ BigDecimal(arr.length)).setScale(6, BigDecimal.RoundingMode.HALF_UP))

    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val n = stdin.readLine.trim.toInt

      val arr = stdin.readLine.split(" ").map(_.trim.toInt)
      plusMinus(arr)
    }
  }
}
