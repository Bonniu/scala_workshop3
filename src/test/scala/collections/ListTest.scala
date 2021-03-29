package collections

import org.scalatest.funsuite.AnyFunSuite

class ListTest extends AnyFunSuite {
  test("same list initialising") {
    val mainList = List(1, 2, 3)
    val listWithType = List[Int](1, 2, 3)
    val withNil = 1 :: 2 :: 3 :: Nil
    val listRange = List.range(1, 4)

    assert(mainList.equals(listWithType))
    assert(listWithType.equals(withNil))
    assert(withNil.equals(listRange))
  }

  test("put anything in list") {
    val value = List(1, 0.312, "123123", 'd', null, 0x023, true)
    assert(value.length == 7)
  }

  test("head and tail") {
    val list = List(1, 2, 3, 4, 5, 6, 7)
    assert(list.head == 1)
    assert(list.tail == List(2, 3, 4, 5, 6, 7))
  }

  test("some list operations") {
    val list = List(2, 1, 3, 7)
    val list2 = 11 :: list
    assert(list2.length == 5)
    assert(list2 == List(11, 2, 1, 3, 7))
    val sortedList = list2.sorted
    assert(sortedList == List(1, 2, 3, 4, 5, 6, 7, 11))
    val listDistinct = list.distinct
  }

}
