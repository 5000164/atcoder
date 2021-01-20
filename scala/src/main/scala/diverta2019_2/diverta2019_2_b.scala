package diverta2019_2

object diverta2019_2_b extends App {
  val in    = new java.util.Scanner(System.in)
  val n     = in.nextInt
  val balls = for (_ <- 1 to n) yield (in.nextInt, in.nextInt)

  def slope(p: (Int, Int), left: Seq[(Int, Int)], r: Seq[Seq[(Int, Int)]]): Seq[Seq[(Int, Int)]] =
    if (left.isEmpty)
      r
    else
      slope(left.head, left.drop(1), r :+ left.map(l => if (p._1 <= l._1) (l._1 - p._1, l._2 - p._2) else (p._1 - l._1, p._2 - l._2)))

  val hoge = slope(balls.head, balls.drop(1), Seq()).flatten
  println(hoge)
//  println(hoge.distinct)
//  println(hoge.groupBy(_).mapValues(_.size))
  println(hoge.groupBy(identity).values)
//  println(hoge.groupBy(identity).mapValues(_.size - 1))
//  println(hoge.groupBy(identity).mapValues(_.size - 1).values)
//  println(hoge.groupBy(identity).mapValues(_.size - 1).values.sum)

//  val answer = n - slope(balls.head, balls.drop(1), Seq()).flatten.distinct.length
  val answer =
//    if (n <= 2)
//      1
//    else
      n - slope(balls.head, balls.drop(1), Seq()).flatten.groupBy(identity).values.map(_.size).filter(_ > 1).sum

  println(answer)
}
