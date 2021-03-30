import org.scalatest.funsuite.AnyFunSuite

class PersonTest extends AnyFunSuite {
  test("apply method") {
    var person = Person("Adam")
    var person2 = Person.apply("Adam")
    var person3 = Person("Adam", "Nowak")
    var person4 = Person.apply("Adam", "Nowak")
    assert(person.toString == person2.toString)
    assert(person3.toString == person4.toString)
  }
}
