package object FormingAMagicSquare {
  object Solution {

    def formingMagicSquare(s: Array[Array[Int]]): Int = {
      val ms = Array(Array(8, 1, 6), Array(3, 5, 7), Array(4, 9, 2))
      val mst = ms.transpose
      val magicSquares = Array(
        ms,
        ms.reverse,
        ms.map(_.reverse),
        ms.reverse.map(_.reverse),
        mst,
        mst.reverse,
        mst.map(_.reverse),
        mst.reverse.map(_.reverse)
      )
      magicSquares.map(m => diffSquare(s, m)).min
    }

    def diffSquare(s1: Array[Array[Int]], s2: Array[Array[Int]]): Int =
      s1.zip(s2).map { case (r1, r2) => r1.zip(r2).map { case (c1, c2) => (c1 - c2).abs }.sum }.sum



    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val s = Array.ofDim[Int](3, 3)

      for (i <- 0 until 3) {
        s(i) = stdin.readLine.split(" ").map(_.trim.toInt)
      }

      val result = formingMagicSquare(s)

      println(result)
    }
  }
}
