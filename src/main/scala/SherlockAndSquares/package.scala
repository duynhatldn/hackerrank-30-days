import scala.io.StdIn

object SherlockAndSquares {
   import scala.io.StdIn


   object Solution {
     def findSquares(startNumber: Int, endNumber: Int) = {


       println((math.floor(math.sqrt(endNumber)) - math.ceil(math.sqrt(startNumber))).toInt + 1)

     }


     def main(args: Array[String]) {

       val numberOfTests = StdIn.readInt



       for (i <- 1 to numberOfTests) {
         val inputIntegers = StdIn.readLine().split(" ")

         val x = createRangeUsingFirstSecondElements(inputIntegers)

         findSquares(x._1, x._2)


       }

     }


     def createRangeUsingFirstSecondElements(inputIntegers: Array[String]) = {
       inputIntegers match {

         case Array(first: String, second: String, _*) => (first.toInt, second.toInt)

       }


     }
   }



 }
