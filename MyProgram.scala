object MyProgram:
  private def abs(n: Int) =
    if n < 0 then -n
    else n

  def formatAbs(x: Int) =
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))