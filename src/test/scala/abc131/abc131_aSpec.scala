package abc131

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc131_aSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc131/tasks/abc131_a") {
    scenario("入力例 1") {
      val input =
        """3776
          |""".stripMargin
      val output =
        """Bad
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc131_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """8080
          |""".stripMargin
      val output =
        """Good
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc131_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 3") {
      val input =
        """1333
          |""".stripMargin
      val output =
        """Bad
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc131_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 4") {
      val input =
        """0024
          |""".stripMargin
      val output =
        """Bad
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc131_a.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
