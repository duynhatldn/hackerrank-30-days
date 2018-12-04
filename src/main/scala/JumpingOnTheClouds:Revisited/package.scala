package object JumpingOnTheClouds {
  import java.io._

  import scala.annotation.tailrec

  object Solution {


    def jumpingOnClouds(c: Array[Int], k: Int): Int = {
      @tailrec
      def aux(xs: List[Int], cnt: Int): Int = xs match {
        case _ => xs.drop(k) match {
          case Nil => if (c.head == 0) cnt + 1 else cnt + 3
          case nxs @ h :: _ if h == 0 => aux(nxs, cnt + 1)
          case nxs => aux(nxs, cnt + 3)
        }
      }
      100 - aux(c.toList, 0)
    }

    def main(args: Array[String]): Unit = {
      val stdin = scala.io.StdIn

      val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

      val nk = stdin.readLine.split(" ")

      val _ = nk(0).trim.toInt

      val k = nk(1).trim.toInt

      val c = stdin.readLine.split(" ").map(_.trim.toInt)
      val result = jumpingOnClouds(c, k)

      printWriter.println(result)

      printWriter.close()
    }
  }


}
