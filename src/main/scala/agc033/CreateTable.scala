package agc033

import scala.util.Random

object CreateTable extends App {
  val board = Array.ofDim[String](1000, 1000)
  for {
    i <- 0 until 1000
    j <- 0 until 1000
  } board(i)(j) = if (Random.nextInt(100) >= 99) {
    "#"
  } else {
    "."
  }
  board.foreach(row => {
    row.foreach(print)
    println("")
  })
}
