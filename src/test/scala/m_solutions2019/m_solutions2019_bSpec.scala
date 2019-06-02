package m_solutions2019

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class m_solutions2019_bSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/m-solutions2019/tasks/m_solutions2019_b") {
    scenario("入力例 1") {
      val input =
        """oxoxoxoxoxoxox
          |""".stripMargin
      val output =
        """YES
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        m_solutions2019_b.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """xxxxxxxx
          |""".stripMargin
      val output =
        """NO
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        m_solutions2019_b.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
