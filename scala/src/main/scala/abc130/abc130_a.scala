package abc130

object abc130_a extends App {
  val in   = new java.util.Scanner(System.in)
  val x, a = in.nextInt

  val answer = if (x >= a) 10 else 0

  println(answer)
}
