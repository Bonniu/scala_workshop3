package collections

import org.scalatest.funsuite.AnyFunSuite

class ArraysTest extends AnyFunSuite {
  var array: Array[Int] = Array(1, 2, 3, 4, 5)
  val reverseArray: Array[Int] = Array(5,4,3,2,1)

  test("Collections.ArraysForeach") {
    assert(Arrays.getSumOfArrayWithForeach(array) === 15)
    assert(Arrays.getValuesToStringFromArray(array) === "12345")
  }

  test("Collections.ArraysAreMutable") {
    val thirdElement = array(2)
    assertCompiles("array(2) = 10")
    array(2) = 10
    assert(array(2) == 10)
    assert(array(3) == 4)
    array(2) = thirdElement
    assert(array(2) == thirdElement)
  }

  test("Collections.ArraysOperations") {
    assert(array.reverse sameElements reverseArray)
    assert(array.sum == reverseArray.sum)
    assert(array.length == reverseArray.length)
    assert(array.contains(5))
    assert(!array.contains(6))
    assert(!array.sameElements(reverseArray))
    assert(array.sameElements(array))
    assert(array.indexOf(5) == 4)
    array = 0 +: array :+ 6
    assert(array.length == 7)
    assert(array(6) == 6 && array.head == 0)
    assert(array.length != reverseArray.length)
    assert(array.filter(_ != 1) sameElements Array(0, 2, 3, 4, 5, 6))
  }
}
