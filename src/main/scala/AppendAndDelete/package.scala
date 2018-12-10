package import java.io._

import scala.annotation.tailrec

object Solution {

  // Complete the appendAndDelete function below.
  def appendAndDelete(s: String, t: String, k: Int): String = {

    @tailrec
    def aux(cs1: List[Char], cs2: List[Char]): Int = (cs1, cs2) match {
      case (Nil, _) => cs2.size
      case (_, Nil) => cs1.size
      case (h1 :: t1, h2 :: t2) if h1 == h2 => aux(t1, t2)
      case _ => cs1.size + cs2.size
    }

    if (s.length() + t.length() <= k) "Yes"
    else {
      val diff = aux(s.toList, t.toList)
      if (k < diff) "No"
      else if ((k - diff) % 2 == 0) "Yes"
      else "No"
    }
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val s = stdin.readLine

    val t = stdin.readLine

    val k = stdin.readLine.trim.toInt

    val result = appendAndDelete(s, t, k)

    printWriter.println(result)

    printWriter.close()
  }
}

