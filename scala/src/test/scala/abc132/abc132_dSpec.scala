package abc132

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc132_dSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc132/tasks/abc132_d") {
    scenario("入力例 1") {
      val input =
        """5 3
          |""".stripMargin
      val output =
        """3
          |6
          |1
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc132_d.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """2000 3
          |""".stripMargin
      val output =
        """1998
          |3990006
          |327341989
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc132_d.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
