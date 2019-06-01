package abc127

object abc127_a extends App {
  val (a, b) = scala.io.StdIn.readLine.split(' ').map(_.toInt) match { case Array(ia, ib) => (ia, ib) }

  println(if (a >= 13) b else if (a >= 6) b / 2 else 0)
}
