package abc134

object abc134_b extends App {
  val in   = new java.util.Scanner(System.in)
  val n, d = in.nextInt

  val answer = math.ceil(n.toDouble / (d * 2 + 1)).toInt

  println(answer)
}
