package diverta2019_2

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class diverta2019_2_bSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/diverta2019-2/tasks/diverta2019_2_b") {
    scenario("入力例 1") {
      val input =
        """2
          |1 1
          |2 2
          |""".stripMargin
      val output =
        """1
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        diverta2019_2_b.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """3
          |1 4
          |4 6
          |7 8
          |""".stripMargin
      val output =
        """1
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        diverta2019_2_b.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 3") {
      val input =
        """4
          |1 1
          |1 2
          |2 1
          |2 2
          |""".stripMargin
      val output =
        """2
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        diverta2019_2_b.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
