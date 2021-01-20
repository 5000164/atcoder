package abc128

object abc128_a extends App {
  val (a, p) = scala.io.StdIn.readLine.split(' ').map(_.toInt) match { case Array(ia, ip) => (ia, ip) }

  println(((a * 3) + p) / 2)
}
