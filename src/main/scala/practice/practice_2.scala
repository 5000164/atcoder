package practice

object practice_2 extends App {
  val (n, _) = scala.io.StdIn.readLine.split(' ').map(_.toInt) match { case Array(x, y) => (x, y) }
  val list   = (2 to n).foldLeft(Seq(1))(judge)
  println(s"! ${list.map(toStringFromInt).mkString("")}")
  System.out.flush()

  def judge(l: Seq[Int], x: Int): Seq[Int] = {
    val quotient    = l.length / 2
    val remainder   = l.length % 2
    val center      = quotient + remainder
    val centerIndex = center - 1

    println(s"? ${toStringFromInt(l(centerIndex))} ${toStringFromInt(x)}")
    scala.io.StdIn.readLine match {
      case "<" =>
        // 比較されたものよりも大きいものだけのリストを作る
        val subList = l.drop(center)

        if (subList.isEmpty) {
          // 比較されたものよりも大きいものがない場合は元のリストの末尾に要素をつなげる
          l :+ x
        } else {
          // 比較されたものよりも大きいものがある場合はそのリストの中での位置を決めてから
          // 切り離したリストごとつなげる
          l.take(center) ++ judge(subList, x)
        }
      case ">" =>
        // 比較されたものよりも小さいものだけのリストを作る
        // リストの要素数が偶数子で中心の要素が一意でなかった場合に
        // 添字の小さい方を比較対象に使用しているので
        // 比較に使用した文字を除外している
        val subList = l.take(center - 1)

        if (subList.isEmpty) {
          // 比較されたものよりも小さいものがない場合はリストの先頭に要素をつなげる
          x +: l
        } else {
          // 比較されたものよりも小さいものがある場合はそのリストの中での位置を決めてから
          // 切り離したリストごとつなげる
          judge(subList, x) ++ l.drop(center - 1)
        }
    }
  }

  def toStringFromInt(i: Int): String = ("A" (0) + (i - 1)).toChar.toString
}
