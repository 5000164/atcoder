package practice

object practice_1 extends App {
  val a      = scala.io.StdIn.readLine.toInt
  val (b, c) = scala.io.StdIn.readLine.split(' ').map(_.toInt) match { case Array(matchedB, matchedC) => (matchedB, matchedC) }
  val s      = scala.io.StdIn.readLine
  println(s"${a + b + c} $s")
}
