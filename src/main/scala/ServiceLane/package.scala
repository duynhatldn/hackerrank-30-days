package object ServiceLane {
  def calcMaxUnit(i:Int, j:Int, widthArray:Array[Int]) : Int = {
    var position = 0
    var maxUnit = 3
    for(position <- i to j) {
      if(widthArray(position) < maxUnit) {
        maxUnit = widthArray(position)
      }
    }
    return maxUnit
  }


  def main(args: Array[String]) {
    val Array(n,t) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    val widthArray = scala.io.StdIn.readLine.split(" ").map(_.toInt)

    var _ = 0
    for(_ <- 0 until t) {
      val Array(i,j) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
      println(calcMaxUnit(i,j,widthArray))
    }
  }
}
