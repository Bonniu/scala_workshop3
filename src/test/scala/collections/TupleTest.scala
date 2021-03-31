package collections

import org.scalactic.Tolerance.convertNumericToPlusOrMinusWrapper
import org.scalatest.funsuite.AnyFunSuite

class TupleTest extends AnyFunSuite {
  test("tuples") {
    val ingredient = ("Apple", 12)
    assert(ingredient._1 == "Apple")
    assert(ingredient._2 == 12)

    val (name, quantity) = ingredient
    assert(name == ingredient._1)
    assert(quantity == ingredient._2)
  }

  test("tuples in list") {
    val numPairs = List[(Double, Int, Double)]((0.1, 5, 0.5), (3.2, -7, -22.40), (2.1, 56, 117.60))
    for ((a, b, result) <- numPairs) {
      assert(a * b === result +- 0.0001)
    }
    for (tuple <- numPairs) {
      assert(tuple._1 * tuple._2 === tuple._3 +- 0.0001)
    }
  }
}
