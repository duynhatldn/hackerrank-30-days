package object DiagonalDifference {
  def diagonal(arr: Array[Array[Int]]) = arr.indices.map((i) => arr(i)(i))

  def diagonalDifference(arr: Array[Array[Int]]): Int = {
    val sliceA = diagonal(arr)
    val sliceB = diagonal(arr.reverse)
    Math.abs(sliceA.sum - sliceB.sum)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    val arr = Array.ofDim[Int](n, n)

    for (i <- 0 until n) {
      arr(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }

    val result = diagonalDifference(arr)

    println(result)
  }
}

