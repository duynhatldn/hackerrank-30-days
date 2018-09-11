//https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
package object TwoString {


  def twoStrings(s1: String, s2: String): String = {
    s1.distinct.exists(p => s2.distinct.exists(_ == p)) match {
      case true => "YES"
      case _ => "NO"
    }
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val q = stdin.readLine.trim.toInt

    for (qItr <- 1 to q) {
      val s1 = stdin.readLine

      val s2 = stdin.readLine

      val result = twoStrings(s1, s2)

      println(result)
    }
  }
}