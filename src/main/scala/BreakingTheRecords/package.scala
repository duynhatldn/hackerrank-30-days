import java.io._
import scala.collection.mutable.ArrayBuffer
package object BreakingTheRecords {
  def breakingRecords(scores: Array[Int]): Array[Int] = {
    var min = scores(0)
    var max = scores(0)
    var records = ArrayBuffer(0,0)

    for (score <- scores) {
      score match {
        case newMin: Int if score < min =>
          min = newMin
          records(1) += 1
        case newMax: Int if score > max =>
          max = newMax
          records(0) += 1
        // Move to next record if there is not change
        // in min & max
        case _ =>
      }
    }

    records.toArray

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val scores = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = breakingRecords(scores)

    printWriter.println(result.mkString(" "))

    printWriter.close()
  }
}
