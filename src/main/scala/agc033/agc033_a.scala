package agc033

object agc033_a extends App {
  val (h, w) = scala.io.StdIn.readLine.split(' ').map(_.toInt) match { case Array(x, y) => (x, y) }

  // 与えられた表を作成する
  var board = Array.ofDim[String](h, w)
  for (row <- 0 until h) {
    scala.io.StdIn.readLine.zipWithIndex.foreach { case (value, index) => board(row)(index) = value.toString }
  }

  // 塗りつぶすまでの回数を数える
  var times = 0
  while (!isFilled(board)) {
    var target: Seq[(Int, Int)] = Seq()
    for {
      i <- board.indices
      j <- board(0).indices
    } judge(board, i, j) match {
      case Some(x) =>
        target = target ++ x
      case None =>
    }

    board = update(board, target, h, w)
    times = times + 1
  }
  println(times.toString)

  def isFilled(board: Array[Array[String]]): Boolean = !board.flatten.contains(".")

  def judge(array: Array[Array[String]], i: Int, j: Int): Option[Seq[(Int, Int)]] =
    if (board(i)(j) == "#") {
      Some(Seq((i - 1, j), (i, j + 1), (i + 1, j), (i, j - 1)))
    } else {
      None
    }

  def update(array: Array[Array[String]], target: Seq[(Int, Int)], h: Int, w: Int): Array[Array[String]] = {
    target.foreach {
      case (i, j) =>
        if (i >= 0 && i < h && j >= 0 && j < w)
          board(i)(j) = "#"
    }
    board
  }
}
