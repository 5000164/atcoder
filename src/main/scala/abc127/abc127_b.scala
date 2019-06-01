package abc127

object abc127_b extends App {
  val (r, d, x) = scala.io.StdIn.readLine.split(' ').map(_.toInt) match { case Array(ir, id, ix) => (ir, id, ix) }

  (1 to 10).foldLeft(Seq.empty[Int])((results, _) => results :+ (r * results.lastOption.getOrElse(x) - d)).foreach(println)
}
