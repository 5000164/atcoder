package abc127

import org.scalatest.FeatureSpec

class abc127_aSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc127/tasks/abc127_a") {
    scenario("入力例 1") {
      val input =
        """30 100
          |""".stripMargin
      val output =
        """100
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          abc127_a.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """12 100
          |""".stripMargin
      val output =
        """50
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          abc127_a.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 3") {
      val input =
        """0 100
          |""".stripMargin
      val output =
        """0
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          abc127_a.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }
  }
}
