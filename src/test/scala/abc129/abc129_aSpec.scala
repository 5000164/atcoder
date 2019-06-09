package abc129

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc129_aSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc129/tasks/abc129_a") {
    scenario("入力例 1") {
      val input =
        """1 3 4
          |""".stripMargin
      val output =
        """4
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc129_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """3 2 3
          |""".stripMargin
      val output =
        """5
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc129_a.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
