package abc129

object abc129_a extends App {
  val in      = new java.util.Scanner(System.in)
  val p, q, r = in.nextInt

  println(Seq(p, q, r).sorted.take(2).sum)
}
