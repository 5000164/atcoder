package abc132

object abc132_b extends App {
  val in = new java.util.Scanner(System.in)
  val n  = in.nextInt
  val p  = Seq.fill(n)(in.nextInt)

  val answer = (p, p.drop(1), p.drop(2)).zipped.toList.count {
    case (a, b, c) => (a < b && b <= c) || (c < b && b <= a)
  }

  println(answer)
}
