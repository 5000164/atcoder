package practice

import org.scalatest.FeatureSpec

class practice_1Spec extends FeatureSpec {
  feature("https://atcoder.jp/contests/practice/tasks/practice_1") {
    scenario("整数 1, 2, 3 と文字列 test が与えられる") {
      val input      = new java.io.StringReader("1\n2 3\ntest\n")
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(input) {
        Console.withOut(outCapture) {
          practice_1.main(Array())
        }
      }
      assert(outCapture.toString === "6 test\n")
    }

    scenario("整数 72, 128, 256 と文字列 myonmyon が与えられる") {
      val input      = new java.io.StringReader("72\n128 256\nmyonmyon\n")
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(input) {
        Console.withOut(outCapture) {
          practice_1.main(Array())
        }
      }
      assert(outCapture.toString === "456 myonmyon\n")
    }
  }
}
