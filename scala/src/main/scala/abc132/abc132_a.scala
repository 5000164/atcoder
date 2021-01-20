package abc132

object abc132_a extends App {
  val in = new java.util.Scanner(System.in)
  val s  = in.next

  val answer =
    if (s.groupBy(identity).size == 2)
      "Yes"
    else
      "No"

  println(answer)
}
