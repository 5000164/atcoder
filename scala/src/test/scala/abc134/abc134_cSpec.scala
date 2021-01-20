package abc134

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc134_cSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc134/tasks/abc134_c") {
    scenario("入力例 1") {
      val input =
        """3
          |1
          |4
          |3
          |""".stripMargin
      val output =
        """4
          |3
          |4
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc134_c.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """2
          |5
          |5
          |""".stripMargin
      val output =
        """5
          |5
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc134_c.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
