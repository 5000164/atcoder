package abc135

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc135_aSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc135/tasks/abc135_a") {
    scenario("入力例 1") {
      val input =
        """2 16
          |""".stripMargin
      val output =
        """9
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc135_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """0 3
          |""".stripMargin
      val output =
        """IMPOSSIBLE
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc135_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 3") {
      val input =
        """998244353 99824435
          |""".stripMargin
      val output =
        """549034394
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc135_a.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
