
object DictionariesAndMaps {
  def main(args: Array[String]): Unit = {

    val n = scala.io.StdIn.readLine

    var namePhone = collection.mutable.Map.empty[String, Int]

    for (i <- 0 to n.toInt-1) {
      val name = scala.io.StdIn.readLine()
      val phone = name.split(" ")
      namePhone += (phone(0).toString -> phone(1).toInt)
    }
    val Search = Iterator.continually(scala.io.StdIn.readLine()).takeWhile(_ != null).mkString(" ").split(" ")

    for (i <- 0 to Search.size-1) {
      if (namePhone contains Search(i)) {
        println(Search(i) + "=" + namePhone(Search(i)))
      } else println("Not found")
    }
  }
}