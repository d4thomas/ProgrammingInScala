import scala.collection.mutable.ArrayBuffer

object NumberStats:
  private def calculateStats(numbers: Seq[Double]): Map[String, Double] =
    Map(
      "Sum" -> numbers.sum,
      "Average" -> numbers.sum / numbers.length,
      "Min" -> numbers.min,
      "Max" -> numbers.max
    )

  @main def showStats(): Unit =

    val numbers = ArrayBuffer(23.5, -42.0, 15.7, 88.1, -12.9, 44.0)
    val stats = NumberStats.calculateStats(numbers.toSeq)

    println(s"Numbers: ${numbers.mkString(", ")}")
    stats.foreach((key, value) =>
      println(f"$key: $value%.2f"))