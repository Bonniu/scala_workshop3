package loops

import scala.collection.immutable.NumericRange

object Ranges {
  def getRangeIntStartToStop(start: Int, stop: Int): Range = {
    start to stop
  }

  def getRangeIntStartUntilStop(start: Int, stop: Int): Range =  {
    start until stop
  }

  def getRangeIntStartToStopByJump(start: Int, stop: Int, jump: Int): Range =  {
    start to stop by jump
  }

  def getArrayRangeCharStartToStop(start: Char, stop: Char): Array[Char] = {
    (start to stop).toArray
  }

  def getRangeListStartToStop(start: Char, stop: Char): List[Char] =  {
    (start to stop).toList
  }
}
