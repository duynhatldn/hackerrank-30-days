package object DivisibleSumPairs {
  object Solution {

    def divisibleSumPairs(n: Int, k: Int, ar: Array[Int]): Int = {

      val l = ar.toList
      l.scanLeft(l)((x, _) => x.tail).foldLeft(0) { (n, arr) =>
        if (arr.nonEmpty) arr.tail.count(x => (arr.head + x) % k == 0) + n
        else n
      }


    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val nk = stdin.readLine.split(" ")

      val n = nk(0).trim.toInt

      val k = nk(1).trim.toInt

      val ar = stdin.readLine.split(" ").map(_.trim.toInt)
      val result = divisibleSumPairs(n, k, ar)

      println(result)

    }
  }

}
