package algorithms

import scala.annotation.tailrec

object Sorting {

  /**
   * Scala style implementation of Bubble Sort using pattern matching and tail recursion.
   * @param list List to sort
   * @return Sorted list
   */
  def bubbleSort(list: List[Int]): List[Int] = {
    @tailrec
    def sort(iteration: List[Int], source: List[Int], result: List[Int]): List[Int] = source match {
      case h1 :: h2 :: rest =>
        if (h1 > h2)  {
          sort(iteration, h1 :: rest, result :+ h2)
        } else {
          sort(iteration, h2 :: rest, result :+ h1)
        }
      case last :: Nil => sort(iteration, Nil, result :+ last)
      case Nil =>
        if (iteration.isEmpty) result
        else sort(iteration.dropRight(1), result, Nil)
    }
    sort(list, list, Nil)
  }
}
