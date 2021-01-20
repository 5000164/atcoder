package abc134

object abc134_c extends App {
  val in = new java.util.Scanner(System.in)
  val n  = in.nextInt
  val a  = Seq.fill(n)(in.nextInt)

  val f = a.indexOf(a.max)
  val s = a.indexOf((a.take(f) ++ a.drop(f + 1)).max)

  val answer = a.indices.map(i => if (i == f) a(s) else a(f)).mkString("\n")

  println(answer)
}
