package object LibraryFine {
  import java.time.LocalDate

  object Solution {

    def libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int = {
      val (returned, expected) = (LocalDate.of(y1, m1, d1), LocalDate.of(y2, m2, d2))
      if (returned.isBefore(expected) || returned.isEqual(expected)) 0
      else if (y1 - y2 > 0) 10000
      else if (m1 - m2 > 0) (m1 - m2) * 500
      else  (d1 - d2) * 15


    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val d1M1Y1 = stdin.readLine.split(" ")

      val d1 = d1M1Y1(0).trim.toInt

      val m1 = d1M1Y1(1).trim.toInt

      val y1 = d1M1Y1(2).trim.toInt

      val d2M2Y2 = stdin.readLine.split(" ")

      val d2 = d2M2Y2(0).trim.toInt

      val m2 = d2M2Y2(1).trim.toInt

      val y2 = d2M2Y2(2).trim.toInt

      val result = libraryFine(d1, m1, y1, d2, m2, y2)

      println(result)

    }
  }

}
