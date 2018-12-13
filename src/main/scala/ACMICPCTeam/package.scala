import java.io._

package object ACMICPCTeam {

    // Complete the acmTeam function below.
    def acmTeam(topic: Array[String]): Array[Int] = {
      val bss = topic.map { s =>
        val bs = new java.util.BitSet()
        s.toCharArray.zipWithIndex.filter(_._1 == '1').map(_._2).foreach(i => bs.set(i))
        bs
      }

      val indices = for {
        i <- (0 until (topic.length - 1)).view
        j <- (i + 1) until topic.length
      } yield (i, j)

      val (maxCnt, maxs) = indices.foldLeft((0, List.empty[java.util.BitSet])) { case ((maxCnt1, maxs1), (i, j)) =>
        val cur = new java.util.BitSet()
        cur.or(bss(i))
        cur.or(bss(j))
        val curCnt = cur.cardinality
        if (curCnt > maxCnt1) (curCnt, List(cur))
        else if (curCnt == maxCnt1) (maxCnt1, cur :: maxs1)
        else (maxCnt1, maxs1)
      }
      Array(maxCnt, maxs.size)
    }

    def main(args: Array[String]): Unit = {
      val stdin = scala.io.StdIn

      val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

      val nm = stdin.readLine.split(" ")

      val n = nm(0).trim.toInt

      val _ = nm(1).trim.toInt

      val topic = Array.ofDim[String](n)

      for (i <- 0 until n) {
        val topicItem = stdin.readLine
        topic(i) = topicItem
      }

      val result = acmTeam(topic)

      printWriter.println(result.mkString("\n"))

      printWriter.close()
    }
  }


