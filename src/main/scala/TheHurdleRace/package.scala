package object TheHurdleRace {
  object Solution {


    def hurdleRace(k: Int, height: Array[Int]): Int = {
      (height.max - k) max 0
    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn


      val nk = stdin.readLine.split(" ")

      val n = nk(0).trim.toInt

      val k = nk(1).trim.toInt

      val height = stdin.readLine.split(" ").map(_.trim.toInt)
      val result = hurdleRace(k, height)

      println(result)
    }
  }

}
