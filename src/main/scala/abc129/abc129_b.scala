package abc129

object abc129_b extends App {
  val in = new java.util.Scanner(System.in)
  val n  = in.nextInt
  val w  = Seq.fill(n)(in.nextInt)

  println((1 until n).map(i => math.abs(w.take(i).sum - w.drop(i).sum)).min)
}
