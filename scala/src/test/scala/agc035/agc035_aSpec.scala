package agc035

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class agc035_aSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/agc035/tasks/agc035_a") {
    scenario("入力例 1") {
      val input =
        """3
          |1 2 3
          |""".stripMargin
      val output =
        """Yes
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        agc035_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """4
          |1 2 4 8
          |""".stripMargin
      val output =
        """No
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        agc035_a.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
