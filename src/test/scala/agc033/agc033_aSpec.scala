package agc033

import org.scalatest.FeatureSpec

class agc033_aSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/agc033/tasks/agc033_a") {
    scenario("入力例 1") {
      val input =
        """3 3
          |...
          |.#.
          |...
          |""".stripMargin
      val output =
        """2
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          agc033_a.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """6 6
          |..#..#
          |......
          |#..#..
          |......
          |.#....
          |....#.
          |""".stripMargin
      val output =
        """3
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          agc033_a.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }
  }
}
