package abc127

import org.scalatest.FeatureSpec

class abc127_bSpec extends FeatureSpec {
  feature("https://atcoder.jp/contests/abc127/tasks/abc127_b") {
    scenario("入力例 1") {
      val input =
        """2 10 20
          |""".stripMargin
      val output =
        """30
          |50
          |90
          |170
          |330
          |650
          |1290
          |2570
          |5130
          |10250
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          abc127_b.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }

    scenario("入力例 2") {
      val input =
        """4 40 60
          |""".stripMargin
      val output =
        """200
          |760
          |3000
          |11960
          |47800
          |191160
          |764600
          |3058360
          |12233400
          |48933560
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          abc127_b.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }
  }
}
