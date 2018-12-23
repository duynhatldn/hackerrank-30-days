import java.io._
import scala.collection.mutable.ListBuffer
package object NonDivisibleSubset {
  def nonDivisibleSubset(k: Int, S: Array[Int]): Int = {
    val arr = ListBuffer.fill[Int](k)(0)
    S.foreach( v => arr(v % k) += 1)
    val count = (1 to k / 2).foldLeft(math.min(arr.head, 1))((acc, v) => if (v != k - v) acc + math.max(arr(v), arr(k - v)) else acc)
    if (k % 2 == 0) count + 1 else count


  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val nk = stdin.readLine.split(" ")

    val n = nk(0).trim.toInt

    val k = nk(1).trim.toInt

    val S = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = nonDivisibleSubset(k, S)

    printWriter.println(result)

    printWriter.close()
  }
}
