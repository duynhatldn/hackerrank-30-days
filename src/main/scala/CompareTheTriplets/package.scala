import scala.io.StdIn

package object CompareTheTriplets {

    def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
      val resultArray = ((a zip b)
        .map(both =>
          (if (both._1 > both._2) 1 else 0, if (both._2 > both._1) 1 else 0))
        .unzip)
      Array(resultArray._1.sum, resultArray._2.sum)
    }
    def main(args: Array[String]) {


      val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

      val b = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

      val result = compareTriplets(a, b)

      println(result.mkString(" "))


    }
  }