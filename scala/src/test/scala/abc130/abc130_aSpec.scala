package abc130

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc130_aSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc130/tasks/abc130_a") {
    scenario("入力例 1") {
      val input =
        """3 5
          |""".stripMargin
      val output =
        """0
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc130_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """7 5
          |""".stripMargin
      val output =
        """10
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc130_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 3") {
      val input =
        """6 6
          |""".stripMargin
      val output =
        """10
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc130_a.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
