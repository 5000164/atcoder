package abc132

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc132_bSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc132/tasks/abc132_b") {
    scenario("入力例 1") {
      val input =
        """5
          |1 3 5 4 2
          |""".stripMargin
      val output =
        """2
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc132_b.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """9
          |9 6 3 2 5 8 7 4 1
          |""".stripMargin
      val output =
        """5
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc132_b.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
