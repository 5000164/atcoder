package agc034

import java.io.ByteArrayInputStream

import org.scalatest.FeatureSpec

class agc034_aSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/agc034/tasks/agc034_a") {
    scenario("入力例 1") {
      val input =
        """7 1 3 6 7
          |.#..#..
          |""".stripMargin
      val output =
        """Yes
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        agc034_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """7 1 3 7 6
          |.#..#..
          |""".stripMargin
      val output =
        """No
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        agc034_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 3") {
      val input =
        """15 1 3 15 13
          |...#.#...#.#...
          |""".stripMargin
      val output =
        """Yes
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        agc034_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("飛び越えられない岩の条件を満たすのがスタート地点より前") {
      val input =
        """4 3 4 3 4
          |##..
          |""".stripMargin
      val output =
        """Yes
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        agc034_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("飛び越えられない岩の条件を満たすのがゴール地点より後") {
      val input =
        """4 1 2 1 2
          |..##
          |""".stripMargin
      val output =
        """Yes
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        agc034_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("追い越しの条件を満たすのがスタート地点より前") {
      val input =
        """8 4 5 8 7
          |.....#..
          |""".stripMargin
      val output =
        """No
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        agc034_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("追い越しの条件を満たすのがゴール地点より後") {
      val input =
        """8 1 2 5 4
          |..#.....
          |""".stripMargin
      val output =
        """No
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        agc034_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("追い越しの条件を満たすのがふぬけのスタート地点より前") {
      val input =
        """6 3 5 8 7
          |.....#..
          |""".stripMargin
      val output =
        """No
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        agc034_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("追い越しの条件を満たすのがふぬけのゴール地点より後") {
      val input =
        """6 1 2 6 4
          |..#...
          |""".stripMargin
      val output =
        """No
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        agc034_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("ふぬけがスタートしている地点で追い越すことができる") {
      val input =
        """6 1 2 6 5
          |...#..
          |""".stripMargin
      val output =
        """Yes
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        agc034_a.main(Array())
      }
      assert(outCapture.toString === output)
    }

    scenario("ふぬけがゴールしている地点で追い越すことができる") {
      val input =
        """6 1 2 6 5
          |..#...
          |""".stripMargin
      val output =
        """Yes
          |""".stripMargin
      System.setIn(new ByteArrayInputStream(input.getBytes))
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withOut(outCapture) {
        agc034_a.main(Array())
      }
      assert(outCapture.toString === output)
    }
  }
}
