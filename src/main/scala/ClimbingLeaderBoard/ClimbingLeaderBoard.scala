package ClimbingLeaderBoard

object ClimbingLeaderBoard {
  def climbingLeaderboard(scores: Array[Int], alice: Array[Int]): Array[Int] = {
     val reScores = scores.reverse.distinct.zipWithIndex
     def findPosition(scores: Array[(Int, Int)], latest: Int, point: Int): Int = {
       if (scores.length <= latest) {
         reScores.length
       } else if (scores(latest)._1 > point) {
         scores(latest)._2
       } else {
         findPosition(scores, latest + 1, point)
       }
     }
     val aliceWithIndex = alice.zipWithIndex
     aliceWithIndex.foldLeft(new Array[Int](alice.length))((ls: Array[Int], current: (Int, Int)) => {
       val latest = ls(if (current._2 == 0) 0 else current._2 - 1)
       ls(current._2) = findPosition(reScores, latest, current._1)
       ls
     }).map(reScores.length - _ + 1)
   }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val scoresCount = stdin.readLine.trim.toInt

    val scores = stdin.readLine.split(" ").map(_.trim.toInt)
    val aliceCount = stdin.readLine.trim.toInt
    val alice = stdin.readLine.split(" ").map(_.trim.toInt)

    val result = climbingLeaderboard(scores, alice)

    println(result.mkString("\n"))
  }
}
