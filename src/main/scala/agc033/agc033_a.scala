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
    val target = for {
      i <- board.indices
      j <- board(0).indices
    } yield judge(board, i, j)
    board = update(board, target)
    times = times + 1
  }
  println(times.toString)

  def isFilled(board: Array[Array[String]]): Boolean = !board.flatten.contains(".")

  def judge(array: Array[Array[String]], i: Int, j: Int): Option[(Int, Int)] = {
    for ((vertical, side) <- Seq((i - 1, j), (i, j + 1), (i + 1, j), (i, j - 1)))
      if (board(i)(j) != "#" && board.isDefinedAt(vertical) && board(vertical).isDefinedAt(side) && board(vertical)(side) == "#") {
        return Some((i, j))
      }
    None
  }

  def update(array: Array[Array[String]], target: Seq[Option[(Int, Int)]]): Array[Array[String]] = {
    target.flatten.foreach { case (i, j) => board(i)(j) = "#" }
    board
  }
}
