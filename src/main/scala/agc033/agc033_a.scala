package agc033

import scala.collection.mutable

object agc033_a extends App {
  val in   = new java.util.Scanner(System.in)
  val h, w = in.nextInt
  val t    = List.fill(h)(in.next)

  // 幅優先探索を行う

  val queue   = mutable.Queue[(Int, Int)]()
  val visited = mutable.Map.empty[(Int, Int), Int]

  // 最初に与えられている黒マスをキューに追加する
  t.zipWithIndex.foreach(r => r._1.zipWithIndex.filter(_._1 == '#').foreach(v => queue += ((r._2, v._2))))

  // 黒マスは訪問済みの印を付ける
  queue.foreach(v => visited((v._1, v._2)) = 0)

  // 塗りつぶすまでの回数を数える
  while (queue.nonEmpty) {
    val v = queue.dequeue()
    val nextTo = Seq((v._1 - 1, v._2), (v._1, v._2 + 1), (v._1 + 1, v._2), (v._1, v._2 - 1))
      .filter(v => v._1 >= 0 && v._1 < h && v._2 >= 0 && v._2 < w)
      .filterNot(visited.contains)
    queue ++= nextTo
    nextTo.foreach(nv => visited((nv._1, nv._2)) = visited((v._1, v._2)) + 1)
  }
  println(visited.maxBy(_._2)._2)
}
