package abc128

object abc128_b extends App {
  val in = new java.util.Scanner(System.in)
  val n  = in.nextInt
  val r  = List.fill(n)(in.next -> in.nextInt)

  r.zipWithIndex
    .sortWith(
      (x, y) =>
        if (x._1._1 == y._1._1) {
          x._1._2 >= y._1._2
        } else if (x._1._1 <= y._1._1) {
          true
        } else {
          false
        }
    )
    .map(_._2 + 1)
    .foreach(println)
}
