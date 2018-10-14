package object DesignerPDFViewer {
  object Solution {

    def designerPdfViewer(h: Array[Int], word: String): Int = {
      val a = word.map(c => h(c.toInt - 97)).max
      word.length * a

    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val h = stdin.readLine.split(" ").map(_.trim.toInt)
      val word = stdin.readLine

      val result = designerPdfViewer(h, word)

      println(result)
    }
  }
}
