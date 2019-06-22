package diverta2019_2

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class diverta2019_2_aSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/diverta2019-2/tasks/diverta2019_2_a") {
    scenario("入力例 1") {
      val input =
        """3 2
          |""".stripMargin
      val output =
        """1
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        diverta2019_2_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """3 1
          |""".stripMargin
      val output =
        """0
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        diverta2019_2_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 3") {
      val input =
        """8 5
          |""".stripMargin
      val output =
        """3
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        diverta2019_2_a.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
