package abc131

object abc131_a extends App {
  val in = new java.util.Scanner(System.in)
  val s  = in.next

  val answer =
    if (s.zip(s.drop(1)).exists(v => v._1 == v._2))
      "Bad"
    else
      "Good"

  println(answer)
}
