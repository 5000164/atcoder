package abc131

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc131_cSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc131/tasks/abc131_c") {
    scenario("入力例 1") {
      val input =
        """4 9 2 3
          |""".stripMargin
      val output =
        """2
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc131_c.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """10 40 6 8
          |""".stripMargin
      val output =
        """23
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc131_c.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 3") {
      val input =
        """314159265358979323 846264338327950288 419716939 937510582
          |""".stripMargin
      val output =
        """532105071133627368
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc131_c.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
