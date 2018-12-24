
package object ModifiedKaprekarNumbers {
  def kaprekarNumbers(p: Int, q: Int) {
    var validRange = false
    for(i <- p to q){
      val rs = i * i
      val ttal = rs.toString
      if (ttal.length() == 1){
        if(ttal.toInt == i){
          print(i + " ")
          validRange = true
        }
      }else{
        val x = ttal.substring(0,ttal.length / 2).toLong
        val y = ttal.substring(ttal.length / 2).toLong
        if(x + y == i) {
          print(i + " ")
          validRange = true
        }
      }

    }
    if(!validRange) println("INVALID RANGE")

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val p = stdin.readLine.trim.toInt

    val q = stdin.readLine.trim.toInt

    kaprekarNumbers(p, q)
  }
}
