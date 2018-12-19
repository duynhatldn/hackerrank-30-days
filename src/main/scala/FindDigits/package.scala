import java.io._
package object FindDigits {
  def findDigits(n: Int): Int = {
    n.toString
      .split("")
      .filter { digit: String =>
        digit.toInt != 0 && n % digit.toInt == 0
      }
      .size

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val t = stdin.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val n = stdin.readLine.trim.toInt

      val result = findDigits(n)

      printWriter.println(result)
    }

    printWriter.close()
  }
}
