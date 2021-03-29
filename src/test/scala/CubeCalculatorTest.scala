import org.scalatest.funsuite.AnyFunSuite

class CubeCalculatorTest extends AnyFunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
    assert(CubeCalculator.cube(0) === 0)
  }

  test("CubeCalculator.square") {
    assert(CubeCalculator.square(3) === 9)
    assert(CubeCalculator.square(0) === 0)
  }
}