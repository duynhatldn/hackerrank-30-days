package object ViralAdvertising {
  import java.io._

  object Solution {

    def viralAdvertising(n: Int): Int = {
      var peops: Int = 5
      var likes = 0
      for(i <- 1 to n) {
        likes += (peops/2)
        peops = (peops / 2) * 3
      }
      likes

    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

      val n = stdin.readLine.trim.toInt

      val result = viralAdvertising(n)

      printWriter.println(result)

      printWriter.close()
    }
  }

}
