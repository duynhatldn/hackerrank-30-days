//https://www.hackerrank.com/challenges/arrays-ds/problem
package Arrays_DS

object Arrays_DS {
  def reverseArray(a: Array[Int]): Array[Int] = {
    a.reverse
  }
  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val arrCount = stdin.readLine.trim.toInt
    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    val res = reverseArray(arr).mkString(" ")
    println(res)
}
