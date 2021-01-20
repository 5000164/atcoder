package abc128

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc128_bSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc128/tasks/abc128_b") {
    scenario("入力例 1") {
      val input =
        """6
          |khabarovsk 20
          |moscow 10
          |kazan 50
          |kazan 35
          |moscow 60
          |khabarovsk 40
          |""".stripMargin
      val output =
        """3
          |4
          |6
          |1
          |5
          |2
          |""".stripMargin
      val outCapture = new java.io.ByteArrayOutputStream
      System.setIn(new ByteArrayInputStream(input.getBytes))
      Console.withOut(outCapture) {
        abc128_b.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """10
          |yakutsk 10
          |yakutsk 20
          |yakutsk 30
          |yakutsk 40
          |yakutsk 50
          |yakutsk 60
          |yakutsk 70
          |yakutsk 80
          |yakutsk 90
          |yakutsk 100
          |""".stripMargin
      val output =
        """10
          |9
          |8
          |7
          |6
          |5
          |4
          |3
          |2
          |1
          |""".stripMargin
      val outCapture = new java.io.ByteArrayOutputStream
      System.setIn(new ByteArrayInputStream(input.getBytes))
      Console.withOut(outCapture) {
        abc128_b.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
