package agc033

object CreateTable extends App {
  val board = Array.ofDim[Char](1000, 1000)
  for {
    i <- 0 until 1000
    j <- 0 until 1000
  } board(i)(j) = '.'
  board.foreach(row => {
    row.foreach(print)
    println("")
  })
}
