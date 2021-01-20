package abc130

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc130_cSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc130/tasks/abc130_b") {
    scenario("入力例 1") {
      val input =
        """3 6
          |3 4 5
          |""".stripMargin
      val output =
        """2
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc130_b.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """4 9
          |3 3 3 3
          |""".stripMargin
      val output =
        """4
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc130_b.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
