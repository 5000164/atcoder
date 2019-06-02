package agc034

object agc034_a extends App {
  val in            = new java.util.Scanner(System.in)
  val n, a, b, c, d = in.nextInt
  val s             = in.next

  // 岩が 2 マス続いている時は飛び越えることはできない
  // スタート地点より前とゴール地点より後の岩は考慮しない

  // すぬけ a -> c
  // ふぬけ b -> d
  // 人物を追い越す必要がある場合は人物を追い越すために 3 マス必要
  // スタート地点より前とふぬけがゴールした後の空白は考慮しない
  // (ふぬけのゴール後に空白があっても戻ることができないため)

  println(if (s.substring(a - 1, if (c > d) c else d).contains("##")) {
    "No"
  } else {
    if (c > d) {
      if (s.substring(b - 2, d + 1).contains("...")) {
        "Yes"
      } else {
        "No"
      }
    } else {
      "Yes"
    }
  })
}
