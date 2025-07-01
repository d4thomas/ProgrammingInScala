object Max:
  def max(x: Int, y: Int): Int =
    if x > y then
      x else
      y

  def formatMax(x: Int, y: Int): Unit =
    val msg = "\nThe max value of %d is %d"
    println(msg.format(x, y, max(x, y)))