package practice

import org.scalatest.FeatureSpec

class practice_2Spec extends FeatureSpec {
  feature("https://atcoder.jp/contests/practice/tasks/practice_2") {
    scenario("N = 3, Q = 10, ans = BAC") {
      val input =
        """3 10
          |>
          |<
          |<
          |""".stripMargin
      val output =
        """? A B
          |? B C
          |? A C
          |! BAC
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          practice_2.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }

    scenario("N = 5, Q = 7, ans = CBADE") {
      val input =
        """5 7
          |>
          |>
          |<
          |<
          |<
          |<
          |<
          |""".stripMargin
      val output =
        """? A B
          |? B C
          |? B D
          |? A D
          |? B E
          |? A E
          |? D E
          |! CBADE
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          practice_2.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }
  }
}
