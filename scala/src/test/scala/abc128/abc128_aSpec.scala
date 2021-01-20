package abc128

import org.scalatest.FeatureSpec

class abc128_aSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc128/tasks/abc128_a") {
    scenario("入力例 1") {
      val input =
        """1 3
          |""".stripMargin
      val output =
        """3
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          abc128_a.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """0 1
          |""".stripMargin
      val output =
        """0
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          abc128_a.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 3") {
      val input =
        """32 21
          |""".stripMargin
      val output =
        """58
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          abc128_a.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }
  }
}
