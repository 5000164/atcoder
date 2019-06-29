package abc132

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc132_aSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc132/tasks/abc132_a") {
    scenario("入力例 1") {
      val input =
        """STOP
          |""".stripMargin
      val output =
        """No
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc132_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """FFEE
          |""".stripMargin
      val output =
        """Yes
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc132_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 3") {
      val input =
        """FREE
          |""".stripMargin
      val output =
        """No
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc132_a.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
