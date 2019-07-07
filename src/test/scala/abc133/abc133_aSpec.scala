package abc133

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc133_aSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc133/tasks/abc133_a") {
    scenario("入力例 1") {
      val input =
        """4 2 9
          |""".stripMargin
      val output =
        """8
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc133_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """4 2 7
          |""".stripMargin
      val output =
        """7
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc133_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 3") {
      val input =
        """4 2 8
          |""".stripMargin
      val output =
        """8
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc133_a.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
