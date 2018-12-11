package import java.io._

object Solution {

  def jumpingOnClouds(c: Array[Int]): Int = {
    var currentPos = 0

    var nJumps = 0

    for ( (e,count) <- c.zipWithIndex ) {
      println(s"$count is $e")
      if (currentPos == count && count <= c.size-2) {
        println(s"currentPos == count && count < c.size-2")
        println(s"$currentPos == $count && $count < ${c.size-2}")

        c(currentPos+ 1) match {
          case 1 => currentPos += 2
          case 0 => if(currentPos+2 <= c.size-1) { c(currentPos+2) match {
            case 1 => currentPos += 1
            case 0 => currentPos += 2
            case _ => -5
          }
          }
        }
        nJumps += 1
        println(s"nJumps = $nJumps")
      }
      else {
        println(s"else")
        println(s"$currentPos == $count && $count < ${c.size-2}")
      }

    }
    nJumps
  }


  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val c = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = jumpingOnClouds(c)

    printWriter.println(result)

    printWriter.close()
  }
}
