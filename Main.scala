import scala.collection.mutable.ArrayBuffer

@main def MyProgram(): Unit =
  val data = ArrayBuffer(-42.0, 23.5, 15.7, 88.1, -12.9, 44.0)
  val text = "Text String"
  val X = 5
  val Y = 10

  AbsoluteValue.formatAbs(data(0).toInt)
  NumberStats.showStats(data)
  CountLetters.countLetters(text)
  Max.formatMax(X, Y)