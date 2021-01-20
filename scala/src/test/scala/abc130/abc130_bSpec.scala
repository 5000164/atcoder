package abc130

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class abc130_bSpec extends FeatureSpec {
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

    scenario("L が 0") {
      val input =
        """1 1
          |0
          |""".stripMargin
      val output =
        """1
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc130_b.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("L が小さい") {
      val input =
        """1 1
          |1
          |""".stripMargin
      val output =
        """1
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc130_b.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("L が大きい") {
      val input =
        """1 1
          |10000
          |""".stripMargin
      val output =
        """1
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc130_b.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("L がマイナス") {
      val input =
        """1 1
          |-1
          |""".stripMargin
      val output =
        """1
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        abc130_b.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("ボールが行って戻ってくる") {
      val input =
        """3 3
          |10 -10 3
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
  }
}
