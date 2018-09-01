
object Arrays_ {
  def main(args: Array[String]) {

    val n = readLine.trim.toInt

    val arr = new Array[Int](n)

    for (i <- 0 until n) {
      arr(i) = readLine.trim.toInt
    }
    for (x <- arr.reverse){
      print(x + " ")
    }
    println()
  }
}


