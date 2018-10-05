package object ElectronicsShop {
  object Solution {


    def getMoneySpent(keyboards: Array[Int], drives: Array[Int], b: Int): Int = {
      val sortedK = keyboards.sorted.reverse
      val sortedD = drives.sorted.reverse

      if (sortedK.last + sortedD.last > b) -1
      else {
        sortedK.foldLeft(-1) { (max, c) =>
          sortedD.find(_ + c <= b) match {
            case None => max
            case Some(m) => if (m + c > max) m + c else max
          }
        }
      }
    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val bnm = stdin.readLine.split(" ")

      val b = bnm(0).trim.toInt

      val n = bnm(1).trim.toInt

      val m = bnm(2).trim.toInt

      val keyboards = stdin.readLine.split(" ").map(_.trim.toInt)

      val drives = stdin.readLine.split(" ").map(_.trim.toInt)

      val moneySpent = getMoneySpent(keyboards, drives, b)

      println(moneySpent)

    }
  }


}
