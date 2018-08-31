package day6



object LetReview {
  def main(arsubstringgs: Array[String]) {
    val n = readLine.trim.toInt
    for (i <- 1 to n) {
      var string = readLine.trim.toString

      for (a <- 0 to string.length - 1 if a % 2 == 1) {
        print(string.charAt(a))
      }

      print(" ")

      for (a <- 0 to string.length - 1 if a % 2 == 0) {
        print(string.charAt(a))
      }

      println();
    }
  }

}
