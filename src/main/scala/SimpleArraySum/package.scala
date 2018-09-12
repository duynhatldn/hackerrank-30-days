package object SimpleArraySum {


  def simpleArraySum(ar: Array[Int]): Int = {
    ar.sum
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val arCount = stdin.readLine.trim.toInt

    val ar = stdin.readLine.split(" ").map(_.trim.toInt)

    val result = simpleArraySum(ar)

    println(result)


  }
}


