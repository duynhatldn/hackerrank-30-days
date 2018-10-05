package object MigratoryBirds {
  object Solution {
    def migratoryBirds(n: Int, ar: Array[Int]): Int = {
      ar.groupBy(identity).toList.minBy(x => (-x._2.count(_ => true), x._1))._1
    }

    def main(args: Array[String]): Unit = {
      val stdin = scala.io.StdIn

      val n = stdin.readLine.trim.toInt

      val ar = stdin.readLine.split(" ").map(_.trim.toInt)
      val result = migratoryBirds(n, ar)

      println(result)

    }
  }


}
