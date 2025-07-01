import scala.collection.mutable.ArrayBuffer

object NumberStats:
  private def calculateStats(numbers: Seq[Double]): Map[String, Double] =
    Map(
      "Sum" -> numbers.sum,
      "Average" -> numbers.sum / numbers.length,
      "Min" -> numbers.min,
      "Max" -> numbers.max
    )

  def showStats(numbers: ArrayBuffer[Double]): Unit =
    val stats = NumberStats.calculateStats(numbers.toSeq)

    println(s"Numbers: ${numbers.mkString(", ")}")
    stats.foreach((key, value) =>
      println(f"$key: $value%.2f"))