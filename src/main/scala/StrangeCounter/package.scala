import java.io._
package object StrangeCounter {

  def strangeCounter(t: Long): Long = {
    var size = 3L

    var s = 1L
    var e = s + size - 1


    while (t < s | t > e) {
      s = e + 1
      size *= 2
      e = s + size - 1
    }
    e - t + 1
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val t = stdin.readLine.trim.toLong

    val result = strangeCounter(t)

    printWriter.println(result)

    printWriter.close()
  }
}

