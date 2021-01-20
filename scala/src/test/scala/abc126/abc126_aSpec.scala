package abc126

import org.scalatest.FeatureSpec

class abc126_aSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc126/tasks/abc126_a") {
    scenario("入力例 1") {
      val input =
        """3 1
          |ABC
          |""".stripMargin
      val output =
        """aBC
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          abc126_a.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """4 3
          |CABA
          |""".stripMargin
      val output =
        """CAbA
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          abc126_a.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }
  }
}
