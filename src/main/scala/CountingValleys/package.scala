package object CountingValleys {
  object Solution {

    def countingValleys(n: Int, s: String): Int = {
      var currentValue = 0
      var contValleys = 0


      for (char <- s ) {
        val comesFromDown = currentValue < 0
        char match {
          case 'U' => currentValue += 1
          case 'D' => currentValue -= 1
          case _ => currentValue
        }
        if (comesFromDown &&  (currentValue == 0)) contValleys += 1
      }
      contValleys


    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val n = stdin.readLine.trim.toInt

      val s = stdin.readLine

      val result = countingValleys(n, s)

      println(result)

    }
  }

}
