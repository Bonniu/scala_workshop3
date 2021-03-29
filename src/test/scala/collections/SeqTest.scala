package collections

import org.scalatest.funsuite.AnyFunSuite

class SeqTest extends AnyFunSuite {
  var seq = Seq(1, 2, 3, 4, 5)
  val reverseSeq = Seq(5,4,3,2,1)

  test("Collections.SequencesForeach") {
    assert(Sequences.getSumOfSeqWithForeach(seq) === 15)
    assert(Sequences.getValuesToStringFromSeq(seq) === "12345")
  }

  test("Collections.SeqAreNotMutable") {
    assert(seq(2) == 3)
    assertDoesNotCompile("seq(2) = 10")
    assertCompiles("seq.updated(2, 10)")
    seq.updated(2,10)
    assert(seq(2) == 3)
    //A copy of this sequence with one single replaced element.
    val newSeq = seq.updated(2, 10)
    assert(newSeq(2) == 10)
  }

  test("Collections.SeqOperations") {
    assert(seq.reverse == reverseSeq)
    assert(seq.sum == reverseSeq.sum)
    assert(seq.length == reverseSeq.length)
    assert(seq.contains(5))
    assert(!seq.contains(6))

    assert(seq.indexOf(5) == 4)
    seq = 0 +: seq :+ 6
    assert(seq.length == 7)
    assert(seq(6) == 6 && seq.head == 0)
    assert(seq.length != reverseSeq.length)
    assert(seq.filter(_ != 1) == Seq(0, 2, 3, 4, 5, 6))
  }
}
