package day11

object Array2D {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var arr = Array.ofDim[Int](6,6)
    for(arr_1 <- 0 until 6) {
      for(arr_2 <- 0 until 6){
        arr(arr_1)(arr_2) = sc.nextInt()
      }
    }
    var A = scala.collection.mutable.ArrayBuffer.empty[Int]

    for (i <- 0 to 3) {
      for (j <- 0 to 3) {
        A += arr(i)(j) + arr(i)(j+1) + arr(i)(j+2) + arr(i+1)(j+1) + arr(i+2)(j) + arr(i+2)(j+1) + arr(i+2)(j+2)
      }
    }
    println(A.sorted.max)
  }
}



