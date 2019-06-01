package agc033

import scala.collection.mutable

object agc033_a extends App {
  val (h, w) = scala.io.StdIn.readLine.split(' ').map(_.toInt) match { case Array(x, y) => (x, y) }

  // 与えられた表を作成する
  var board = Array.ofDim[String](h, w)
  for (row <- 0 until h) {
    scala.io.StdIn.readLine.zipWithIndex.foreach { case (value, index) => board(row)(index) = value.toString }
  }

  // 幅優先探索を行う

  val queue   = mutable.Queue[(Int, Int)]()
  val visited = mutable.Set[(Int, Int)]()

  // 最初に与えられている黒マスをキューに追加する
  board.zipWithIndex.foreach(row => row._1.zipWithIndex.filter(_._1 == "#").foreach(v => queue += ((row._2, v._2))))

  // 黒マスは訪問済みの印を付ける
  queue.foreach(v => visited += ((v._1, v._2)))

  // 塗りつぶすまでの回数を数える
  var times = 0
  while (queue.nonEmpty) {
    // 深さを数えるために 1 つの深さごとにキューを分けて数えられるようにする
    val nextQueue = mutable.Queue[(Int, Int)]()
    while (queue.nonEmpty) {
      val v = queue.dequeue()
      val nextTo = Seq((v._1 - 1, v._2), (v._1, v._2 + 1), (v._1 + 1, v._2), (v._1, v._2 - 1))
        .filter(v => v._1 >= 0 && v._1 < h && v._2 >= 0 && v._2 < w)
        .filterNot(visited.contains)
      nextQueue ++= nextTo
      nextTo.foreach(v => visited += ((v._1, v._2)))
    }
    queue ++= nextQueue

    // キューが空になっていた場合は塗りつぶし終わったということなので回数には加えない
    if (queue.nonEmpty) times = times + 1
  }
  println(times.toString)
}
