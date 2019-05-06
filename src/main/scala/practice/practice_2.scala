package practice

object practice_2 extends App {
  val (n, _) = scala.io.StdIn.readLine.split(' ').map(_.toInt) match { case Array(x, y) => (x, y) }

  if (n <= 5) {
    // 比較回数を減らすために事前条件を洗い出すので文字列が少ない場合でしか機能しない
    // 考え方としては、比較してソートしていくのではなく、
    // 組み合わせとしてあり得る可能性を排除していき最後の 1 つまで絞り込んでいく

    // 先にすべてのパターンを列挙しておく
    var possibilities = combinations((1 to n).mkString(""), "", n)

    // 列挙したパターンから可能性を排除していき、
    // 最後の 1 つになったら検索を終了とする
    while (possibilities.length > 1) {
      // 最も可能性を排除できる比較はどの文字とどの文字の組み合わせなのかを絞り込む
      // 比較した結果どちらが大きいかは現時点ではわからないので、
      // 大きかった場合と小さかった場合の平均をその組み合わせがパターンを排除できる数として考える
      // 平均だけだと残る可能性が多い方の結果が出た場合に候補があんまり減らないので
      // 平均が同じ場合には分散も利用する
      val (condition, _, _) = combinations((1 to n).mkString(""), "", 2)
        .map(c => {
          // 可能性を何個減らせるかをすべての組み合わせで計算する
          // 可能性が 0 になる場合を含んでいたら除外する (一度比較した条件の場合に残り 0 になる)
          val smaller = possibilities.count(p => p.indexOf(c(0)) < p.indexOf(c(1)))
          val bigger  = possibilities.count(p => p.indexOf(c(1)) < p.indexOf(c(0)))
          if (smaller > 0 && bigger > 0) {
            val average  = (smaller + bigger) / 2.0
            val variance = (Math.pow(smaller - average, 2) + Math.pow(bigger - average, 2)) / 2.0
            Some(c, average, variance)
          } else {
            None
          }
        })
        .collect { case Some(v) => v }
        .reduceLeft(
          (left, right) =>
            // 可能性が最も少なくなるものだけを残す
            if (left._2 < right._2) {
              left
            } else if (left._2 > right._2) {
              right
            } else {
              // 平均が同じ場合は分散が小さい方を残す
              if (left._3 <= right._3) {
                left
              } else {
                right
              }
            }
        )

      // 比較した結果に応じて列挙したパターンから該当しないものを削除する
      println(s"? ${toStringFromInt(condition(0).asDigit)} ${toStringFromInt(condition(1).asDigit)}")
      possibilities = scala.io.StdIn.readLine match {
        case "<" => possibilities.filter(p => p.indexOf(condition(0)) < p.indexOf(condition(1)))
        case ">" => possibilities.filter(p => p.indexOf(condition(1)) < p.indexOf(condition(0)))
      }
    }

    println(s"! ${possibilities.head.map(s => toStringFromInt(s.asDigit)).mkString("")}")
    System.out.flush()
  } else {
    val list = (2 to n).foldLeft(Seq(1))(judge)
    println(s"! ${list.map(toStringFromInt).mkString("")}")
    System.out.flush()
  }

  def combinations(target: String, prefix: String, length: Int): Seq[String] = {
    if (prefix.length == length) {
      Seq(prefix)
    } else {
      target.flatMap(char => {
        combinations(target.diff(char.toString), prefix + char, length)
      })
    }
  }

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
