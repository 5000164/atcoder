package abc131

object abc131_c extends App {
  val in         = new java.util.Scanner(System.in)
  val a, b, c, d = in.nextLong

  def count(now: Long, limit: Long, dividers: Seq[Long], counter: Long): Long =
    if (now > limit)
      counter
    else if (dividers.forall(now % _ != 0))
      count(now + 1, limit, dividers, counter + 1)
    else
      count(now + 1, limit, dividers, counter)

  val answer = count(a, b, Seq(c, d), 0)

  println(answer)
}
