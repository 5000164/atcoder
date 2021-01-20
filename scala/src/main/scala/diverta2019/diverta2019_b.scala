package diverta2019

object diverta2019_b extends App {
  val (r, g, b, n) = scala.io.StdIn.readLine.split(' ').map(_.toInt) match { case Array(ir, ig, ib, in) => (ir, ig, ib, in) }

  var count = 0

  for {
    i <- 0 to n / r
    j <- 0 to n / g
  } {
    val remain = n - (r * i) - (g * j)
    if (remain >= 0 && remain % b == 0) count = count + 1
  }

  println(count)
}
