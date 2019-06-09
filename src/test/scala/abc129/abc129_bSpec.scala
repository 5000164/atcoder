package abc129

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc129_bSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc129/tasks/abc129_a") {
    scenario("入力例 1") {
      val input =
        """3
          |1 2 3
          |""".stripMargin
      val output =
        """0
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc129_b.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """4
          |1 3 1 1
          |""".stripMargin
      val output =
        """2
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc129_b.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 3") {
      val input =
        """8
          |27 23 76 2 3 5 62 52
          |""".stripMargin
      val output =
        """2
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc129_b.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
