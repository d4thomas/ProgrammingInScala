object CountLetters:
  def countLetters(text: String): Unit =
    println(s"Text: $text, Length: ${text.length}")
    print(text.zipWithIndex.map {
      case (char, i) =>
        s"$i: '$char'" }.mkString(" "))