package

  import java.time.LocalTime
  import java.time.format.DateTimeFormatter

  object Solution {
    def timeConversion(s: String): String = {
      val formatter = DateTimeFormatter.ofPattern("hh:mm:ssa")
      val parsedTime = LocalTime.parse(s, formatter)
      parsedTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
    }

    def main(args: Array[String]) {
      val scan = scala.io.StdIn

      val s = scan.readLine

      val result = timeConversion(s)

      println(result)

    }
  }


