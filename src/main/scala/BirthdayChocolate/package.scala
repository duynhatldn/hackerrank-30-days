import java.io._
import scala.io._
package object BirthdayChocolate {

  object Solution {

    // Complete the birthday function below.
    def birthday(s: Array[Int], d: Int, m: Int): Int = {
      println(s"Day: $d")
      println(s"Month: $m")
      (s.size) match {
        case endIndex: Int if endIndex > 0 =>
          (0 until endIndex).map { i: Int =>
            s.slice(i, i + m).sum
          }.filter { _ == d }.size
        case _ => 0
      }

    }

    def main(args: Array[String]) {
      val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

      val n = StdIn.readLine.trim.toInt

      val s = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
      val dm = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

      val d = dm(0).toInt

      val m = dm(1).toInt

      val result = birthday(s, d, m)

      printWriter.println(result)

      printWriter.close()
    }
  }
}
