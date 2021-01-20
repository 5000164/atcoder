package abc134

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc134_aSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc134/tasks/abc134_a") {
    scenario("入力例 1") {
      val input =
        """4
          |""".stripMargin
      val output =
        """48
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc134_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """15
          |""".stripMargin
      val output =
        """675
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc134_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 3") {
      val input =
        """80
          |""".stripMargin
      val output =
        """19200
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc134_a.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
