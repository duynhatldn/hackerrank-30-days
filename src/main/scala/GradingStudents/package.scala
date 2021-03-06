package object GradingStudents {
  object Solution {

    def gradingStudents(grades: Array[Int]): Array[Int] = {
      grades.map{
        e => {
          val nextFiveDivisibleNumber = (e/5 + 1) * 5
          if(nextFiveDivisibleNumber - e < 3 && e > 37)
            nextFiveDivisibleNumber
          else e
        }
      }

    }

    def main(args: Array[String]) {
      val scan = scala.io.StdIn

      val n = scan.readLine.trim.toInt

      val grades = Array.ofDim[Int](n)

      for (gradesItr <- 0 until n) {
        val gradesItem = scan.readLine.trim.toInt
        grades(gradesItr) = gradesItem}

      val result = gradingStudents(grades)

      println(result.mkString("\n"))

    }
  }


}
