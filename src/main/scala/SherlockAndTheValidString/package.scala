import java.io._
import scala.collection.mutable.HashMap
import scala.collection.immutable.ListMap
package object SherlockAndTheValidString {
  def isValid(s: String): String = {
    try {
      val hashMap1: HashMap[String, Int] = HashMap()

      s.map(ch => {
        if (hashMap1.contains(String.valueOf(ch))) {
          hashMap1.update(String.valueOf(ch), hashMap1(String.valueOf(ch)) + 1)
        } else
          hashMap1 += String.valueOf(ch) -> 1
      })

      val a = ListMap(hashMap1.toList.map(x => (x._2, 1)).groupBy(_._1).map { case (key, value) => key -> (value.map(_._2).sum) }.toSeq.sortBy(_._1): _*)

      println(a)

      if (a.size == 1)
        "YES"
      else if (a.size == 2 && ((a.keySet.toList(1) - a.keySet.toList(0)) == 1) && a(a.keySet.toList(1)) == 1)
        "YES"
      else if (a.size == 2 && a(1) == 1)
        "YES"
      else
        "NO"
    }
    catch {
      case ex: Exception => "NO"
    }


  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val s = stdin.readLine

    val result = isValid(s)

    printWriter.println(result)

    printWriter.close()
  }
}
