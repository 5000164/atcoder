package abc126

object abc126_a extends App {
  val (n, k) = scala.io.StdIn.readLine.split(' ').map(_.toInt) match { case Array(in, ik) => (in, ik) }
  val s      = scala.io.StdIn.readLine

  println(
    s.zipWithIndex
      .map {
        case (value, index) =>
          if (index == k - 1) value.toLower
          else value
      }
      .mkString("")
  )
}
