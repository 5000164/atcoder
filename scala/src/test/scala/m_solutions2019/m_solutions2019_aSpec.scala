package m_solutions2019

import org.scalatest.FeatureSpec

class m_solutions2019_aSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/m-solutions2019/tasks/m_solutions2019_a") {
    scenario("入力例 1") {
      val input =
        """3
          |""".stripMargin
      val output =
        """180
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          m_solutions2019_a.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """100
          |""".stripMargin
      val output =
        """17640
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          m_solutions2019_a.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }
  }
}
