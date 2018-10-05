package object DayOfTheProgrammer {
  object Solution {

    def solve(year: Int): String =
      if (year == 1918) "26.09.1918"
      else if (isLeap(year)) "12.09." + year
      else "13.09." + year

    def isLeap(year: Int): Boolean =
      if (year < 1918) year % 4 == 0
      else year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)

    def main(args: Array[String]): Unit = {
      val scan = scala.io.StdIn

      val year = scan.readLine.toInt

      println(solve(year))
    }
  }


}
