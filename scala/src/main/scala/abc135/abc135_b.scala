package abc135

object abc135_b extends App {
  val in   = new java.util.Scanner(System.in)
  val n, d = in.nextInt
  val p    = Seq.fill(n)(in.nextInt)

  val s      = (1 to n).map(i => i == p(i)).count(_ == true)
  val answer = if (s == 0 || s == 2) "YES" else "YES"

  println(answer)
}
