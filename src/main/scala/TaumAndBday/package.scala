package import java.io._

object Solution {
  def taumBday(b: Int, w: Int, bc: Int, wc: Int, z: Int): Int = {
    return (b * bc).min(b * (wc + z)) + (w * wc).min(w * (bc + z))

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val t = stdin.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val bw = stdin.readLine.split(" ")

      val b = bw(0).trim.toInt

      val w = bw(1).trim.toInt

      val bcWcz = stdin.readLine.split(" ")

      val bc = bcWcz(0).trim.toInt

      val wc = bcWcz(1).trim.toInt

      val z = bcWcz(2).trim.toInt

      val result = taumBday(b, w, bc, wc, z)

      printWriter.println(result)
    }

    printWriter.close()
  }
}

