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

  test("Nil") {
    assert(Nil == List())
    assert(Nil.eq(List()))
    assert(Nil.equals(List()))
    assert(System.identityHashCode(Nil) == System.identityHashCode(List()))
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
    assert(sortedList == List(1, 2, 3, 7, 11))

    val list3 = 1 :: 1 :: 2 :: 3 :: 5 :: 8 :: 8 :: 8 :: Nil
    val listDistinct = list3.distinct
    assert(listDistinct.length === 5)
  }

  test("getting elements from List") {
    val list = List(23, 11, 30, 27)
    assert(list(3) === 27)

    assertThrows[IndexOutOfBoundsException] {
      val gettingOutOfList = list(5) // list() rzuca wyjątek
    }

    val liftValue = list.lift(5) // jeżeli nie ma zwróci None
    assert(liftValue === None)
  }

}
