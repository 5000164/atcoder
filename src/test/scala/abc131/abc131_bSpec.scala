package abc131

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc131_bSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc131/tasks/abc131_b") {
    scenario("入力例 1") {
      val input =
        """5 2
          |""".stripMargin
      val output =
        """18
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc131_b.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """3 -1
          |""".stripMargin
      val output =
        """0
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc131_b.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 3") {
      val input =
        """30 -50
          |""".stripMargin
      val output =
        """-1044
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc131_b.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
