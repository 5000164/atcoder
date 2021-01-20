package abc133

object abc133_a extends App {
  val in      = new java.util.Scanner(System.in)
  val n, a, b = in.nextInt

  val answer = if (n * a < b) n * a else b

  println(answer)
}
