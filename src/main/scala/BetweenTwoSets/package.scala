import java.io.PrintWriter
package object BetweenTwoSets {
  def getTotalX(a: Array[Int], b: Array[Int]): Int = {
    (a.min to b.max).count(v =>
      a.forall(i => v % i == 0) &&
        b.forall(j => j % v == 0)
    )
  }

  def main(args: Array[String]) {
    val scan = scala.io.StdIn

    val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

    val nm = scan.readLine.split(" ")

    val n = nm(0).trim.toInt

    val m = nm(1).trim.toInt

    val a = scan.readLine.split(" ").map(_.trim.toInt)

    val b = scan.readLine.split(" ").map(_.trim.toInt)
    val total = getTotalX(a, b)

    fw.println(total)

    fw.close()
  }
}
