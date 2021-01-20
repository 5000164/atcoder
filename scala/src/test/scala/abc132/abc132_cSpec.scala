package abc132

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc132_cSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc132/tasks/abc132_c") {
    scenario("入力例 1") {
      val input =
        """6
          |9 1 4 4 6 7
          |""".stripMargin
      val output =
        """2
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc132_c.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """8
          |9 1 14 5 5 4 4 14
          |""".stripMargin
      val output =
        """0
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc132_c.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 3") {
      val input =
        """14
          |99592 10342 29105 78532 83018 11639 92015 77204 30914 21912 34519 80835 100000 1
          |""".stripMargin
      val output =
        """42685
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc132_c.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
