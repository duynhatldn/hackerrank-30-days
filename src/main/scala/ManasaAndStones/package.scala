import java.io._


package object ManasaAndStones {
  def stones(size: Int, a: Int, b: Int): Array[Int] = {
    val l = Array.fill(size - 1)(a)

    var sums = new scala.collection.mutable.ListBuffer[Int]
    sums += l.sum
    for (i <- 0 to l.size - 1) {
      l(l.size - 1 - i) = b
      sums += l.sum
    }

    sums.toArray
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val T = stdin.readLine.trim.toInt

    for (TItr <- 1 to T) {
      val n = stdin.readLine.trim.toInt

      val a = stdin.readLine.trim.toInt

      val b = stdin.readLine.trim.toInt

      val result = stones(n, a, b)

      printWriter.println(result.mkString(" "))
    }

    printWriter.close()
  }
}
