import collections.Arrays
import org.scalatest.funsuite.AnyFunSuite

class LambdaTest extends AnyFunSuite {
  test("basic usage of lambda functions") {
    // lambda expression
    val ex1 = (x: Int) => x + 2

    // with multiple parameters
    val ex2 = (x: Int, y: Int) => x * y

    assert(ex1(7) === 9)
    assert(ex2(3, 4) === 12)
  }

  test("using lambda in array methods") {
    val array = Array(1, 1, 2, 3, 5, 8)

    val squared = array.map((x: Int) => x * x) // dwa rodzaje zapisu
    val filtered = array.filter(x => x > 4)

    assert(Arrays.getSumOfArrayWithForeach(squared) === 104)
    assert(filtered.length == 2)
  }
}
