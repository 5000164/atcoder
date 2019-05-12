package diverta2019

import org.scalatest.FeatureSpec

class diverta2019_bSpec extends FeatureSpec {
  feature("https://diverta2019.contest.atcoder.jp/tasks/diverta2019_b") {
    scenario("入力例 1") {
      val input =
        """1 2 3 4
          |""".stripMargin
      val output =
        """4
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          diverta2019_b.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """13 1 4 3000
          |""".stripMargin
      val output =
        """87058
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          diverta2019_b.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }
  }
}
