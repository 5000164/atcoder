package agc035

object agc035_a extends App {
  val in      = new java.util.Scanner(System.in)
  val n, a, b = in.nextInt

  def generatePatterns(input: Seq[Int], building: Seq[Int]): Seq[Seq[Int]] =
    if (input.length <= 1)
      Seq(building :+ input.head)
    else
      (for (i <- input.indices)
        yield
          generatePatterns(
            input.take(i) ++ input.drop(i + 1),
            building :+ input(i)
          )).flatten

  val patterns = generatePatterns(Seq(1, 2, 3), Seq())
  val answer = patterns.map(p => (p, p.drop(1), p.drop(2)).zipped.toList)

  println(answer)
}
