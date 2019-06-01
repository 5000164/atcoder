package diverta2019

import org.scalatest.FeatureSpec

class diverta2019_aSpec extends FeatureSpec {
  feature("https://diverta2019.contest.atcoder.jp/tasks/diverta2019_a") {
    scenario("入力例 1") {
      val input =
        """3 2
          |""".stripMargin
      val output =
        """2
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          diverta2019_a.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """13 3
          |""".stripMargin
      val output =
        """11
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          diverta2019_a.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }
  }
}
