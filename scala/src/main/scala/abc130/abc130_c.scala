package abc130

object abc130_c extends App {
  val in   = new java.util.Scanner(System.in)
  val n, x = in.nextInt

  def count(position: Int, times: Int): Int =
    if (position <= x && times <= n)
      count(position + in.nextInt, times + 1)
    else
      times - 1

  val answer = count(0, 1)

  println(answer)
}
