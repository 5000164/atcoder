package abc131

object abc131_b extends App {
  val in   = new java.util.Scanner(System.in)
  val n, l = in.nextInt

  val apples         = for (i <- 1 to n) yield i + l - 1
  val idealApplePie  = math.abs(apples.sum)
  val eatenApplePies = for (i <- 1 to n) yield (apples.take(i - 1) ++ apples.drop(i)).sum

  val answer = eatenApplePies(
    eatenApplePies
      .map(idealApplePie - math.abs(_))
      .zipWithIndex
      .minBy(v => math.abs(v._1))
      ._2
  )

  println(answer)
}
