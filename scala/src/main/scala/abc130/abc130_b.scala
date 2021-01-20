package abc130

object abc130_b extends App {
  val in   = new java.util.Scanner(System.in)
  val n, x = in.nextInt
  val l    = Seq.fill(n)(in.nextInt)

  def count(p: Int, t: Int, l: Seq[Int]): Int =
    if (l.nonEmpty)
      count(p + l.head, if (p <= x) t + 1 else t, l.drop(1))
    else
      t

  val answer = count(0, 0, l)

  println(answer)
}
