import java.io._
package object TheTimeInWords {
  def numMatch = scala.collection.immutable.Map(
    1 -> "one", 2 -> "two", 3 -> "three", 4 -> "four", 5 -> "five", 6 -> "six",
    7 -> "seven", 8 -> "eight", 9 -> "nine", 10 -> "ten", 11 -> "eleven",
    12 -> "twelve", 13 -> "thirteen", 14 -> "fourteen", 15 -> "fifteen",
    16 -> "sixteen", 17 -> "seventeen", 18 -> "eighteen", 19 -> "nineteen",
    20 -> "twenty", 21 -> "twenty one", 22 -> "twenty two", 23 -> "twenty three",
    24 -> "twenty four", 25 -> "twenty five", 26 -> "twenty six",
    27 -> "twenty seven", 28 -> "twenty eight", 29 -> "twenty nine"
  )

  def timeInWords(h: Int, m: Int): String = m match {
    case min if min == 0 => s"${numMatch(h)} o' clock"
    case min if min == 15 => s"quarter past ${numMatch(h)}"
    case min if min == 30 => s"half past ${numMatch(h)}"
    case min if min == 45 => s"quarter to ${numMatch(h+1)}"
    case min if min < 30 => s"${numMatch(m)} ${if (min == 1) "minute" else "minutes"} past ${numMatch(h)}"
    case min if min > 30 => s"${numMatch(60 % min)} minutes to ${numMatch(h+1)}"

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val h = stdin.readLine.trim.toInt

    val m = stdin.readLine.trim.toInt

    val result = timeInWords(h, m)

    printWriter.println(result)

    printWriter.close()
  }
}
