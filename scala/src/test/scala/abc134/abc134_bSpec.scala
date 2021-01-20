package abc134

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc134_bSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc134/tasks/abc134_b") {
    scenario("入力例 1") {
      val input =
        """6 2
          |""".stripMargin
      val output =
        """2
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc134_b.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """14 3
          |""".stripMargin
      val output =
        """2
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc134_b.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 3") {
      val input =
        """20 4
          |""".stripMargin
      val output =
        """3
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc134_b.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
