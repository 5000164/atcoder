package abc132

object abc132_c extends App {
  val in = new java.util.Scanner(System.in)
  val n  = in.nextInt
  val d  = Seq.fill(n)(in.nextInt)

  val half   = d.length / 2
  val sorted = d.sorted

  val answer = sorted(half) - sorted(half - 1)

  println(answer)
}
