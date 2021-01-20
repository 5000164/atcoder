package m_solutions2019

object m_solutions2019_b extends App {
  val in = new java.util.Scanner(System.in)
  val r  = in.next

  println(if ((15 - r.length) >= (8 - r.count(_ == 'o'))) "YES" else "NO")
}
