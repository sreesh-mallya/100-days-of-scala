package algorithms

import algorithms.Sorting.bubbleSort
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.contain
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class SortingTest extends AnyFlatSpec {
  "bubbleSort" should "sort elements in ascending order for a list with some elements" in {
    val list = List(4, 7, 2, 9, 3, 8, 1, 5)
    bubbleSort(list) should contain theSameElementsInOrderAs list.sorted
  }

  it should "return an empty list when the input is an empty list" in {
    bubbleSort(List()) shouldBe Nil
  }
}
