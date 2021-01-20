package abc131

object abc131_c extends App {
  val in         = new java.util.Scanner(System.in)
  val a, b, c, d = in.nextLong

  def calcGcd(a: Long, b: Long): Long = {
    val r = a % b
    if (r == 0)
      b
    else
      calcGcd(b, r)
  }

  val possibility = b - a + 1
  val minusByC    = (b / c) - ((a - 1) / c)
  val minusByD    = (b / d) - ((a - 1) / d)
  val gcd         = if (c >= d) calcGcd(c, d) else calcGcd(d, c)
  val lcm         = c * d / gcd
  val duplicate   = (b / lcm) - ((a - 1) / lcm)

  val answer = possibility - (minusByC + minusByD - duplicate)

  println(answer)
}
