class Person() {
  var name = ""
  var surname = ""

  override def toString: String = s"Person - name: $name, surname: $surname"
}

object Person {
  def apply(name: String): Person = {
    var p = new Person
    p.name = name
    p
  }

  def apply(name: String, surname: String): Person = {
    var p = new Person
    p.name = name
    p.surname = surname
    p
  }
}