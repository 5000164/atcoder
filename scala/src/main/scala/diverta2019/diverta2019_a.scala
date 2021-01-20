package diverta2019

object diverta2019_a extends App {
  val (n, k) = scala.io.StdIn.readLine.split(' ').map(_.toInt) match { case Array(x, y) => (x, y) }

  println(n - k + 1)
}
