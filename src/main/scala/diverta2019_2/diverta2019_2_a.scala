package diverta2019_2

object diverta2019_2_a extends App {
  val in   = new java.util.Scanner(System.in)
  val n, k = in.nextInt

  val answer = if (k == 1) 0 else n - k

  println(answer)
}
