package abc135

object abc135_a extends App {
  val in   = new java.util.Scanner(System.in)
  val a, b = in.nextInt

  val answer = if ((a + b) % 2 == 0) (a + b) / 2 else "IMPOSSIBLE"

  println(answer)
}
