package object SequenceEquation {
  import java.io._
  object Solution {
    def permutationEquation(p: Array[Int]): Array[Int] = {
      val reverseIndexList = (0 :: p.toList).zipWithIndex.tail
      val reverseIndexMap = reverseIndexList.toMap

      val result = for (i <- 1 until p.length + 1) yield reverseIndexMap.getOrElse            (reverseIndexMap.getOrElse(i, -1), -1)

      result.toArray


    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

      val n = stdin.readLine.trim.toInt

      val p = stdin.readLine.split(" ").map(_.trim.toInt)
      val result = permutationEquation(p)

      printWriter.println(result.mkString("\n"))

      printWriter.close()
    }
  }

}
