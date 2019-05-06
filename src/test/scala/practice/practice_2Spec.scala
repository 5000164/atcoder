package practice

import org.scalatest.FeatureSpec

class practice_2Spec extends FeatureSpec {
  feature("https://atcoder.jp/contests/practice/tasks/practice_2") {
    scenario("N = 3, Q = 10, ans = BAC") {
      val input =
        """3 10
          |>
          |<
          |""".stripMargin
      val output =
        """? A B
          |? A C
          |! BAC
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          practice_2.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }

    scenario("N = 5, Q = 7, ans = CBADE") {
      val input =
        """5 7
          |>
          |<
          |<
          |<
          |>
          |>
          |<
          |""".stripMargin
      val output =
        """? A B
          |? C D
          |? A D
          |? A E
          |? A C
          |? B C
          |? D E
          |! CBADE
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          practice_2.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }

    scenario("N = 5, Q = 7, ans = ABCDE") {
      val input =
        """5 7
          |<
          |<
          |<
          |<
          |<
          |<
          |<
          |""".stripMargin
      val output =
        """? A B
          |? C D
          |? A C
          |? C E
          |? D E
          |? B D
          |? B C
          |! ABCDE
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          practice_2.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }

    scenario("N = 5, Q = 7, ans = EDCBA") {
      val input =
        """5 7
          |>
          |>
          |>
          |>
          |>
          |>
          |>
          |""".stripMargin
      val output =
        """? A B
          |? C D
          |? A C
          |? C E
          |? D E
          |? B D
          |? B C
          |! EDCBA
          |""".stripMargin
      val reader     = new java.io.StringReader(input)
      val outCapture = new java.io.ByteArrayOutputStream
      Console.withIn(reader) {
        Console.withOut(outCapture) {
          practice_2.main(Array())
        }
      }
      assert(outCapture.toString === output)
    }
  }

  feature("combinations") {
    scenario("abc から長さ 2 つの組み合わせを作る") {
      assert(
        practice_2.combinations("abc", "", 2) === Seq(
          "ab",
          "ac",
          "ba",
          "bc",
          "ca",
          "cb"
        )
      )
    }

    scenario("abcde から長さ 5 つの組み合わせを作る") {
      assert(
        practice_2.combinations("abcde", "", 5) === Seq(
          "abcde",
          "abced",
          "abdce",
          "abdec",
          "abecd",
          "abedc",
          "acbde",
          "acbed",
          "acdbe",
          "acdeb",
          "acebd",
          "acedb",
          "adbce",
          "adbec",
          "adcbe",
          "adceb",
          "adebc",
          "adecb",
          "aebcd",
          "aebdc",
          "aecbd",
          "aecdb",
          "aedbc",
          "aedcb",
          "bacde",
          "baced",
          "badce",
          "badec",
          "baecd",
          "baedc",
          "bcade",
          "bcaed",
          "bcdae",
          "bcdea",
          "bcead",
          "bceda",
          "bdace",
          "bdaec",
          "bdcae",
          "bdcea",
          "bdeac",
          "bdeca",
          "beacd",
          "beadc",
          "becad",
          "becda",
          "bedac",
          "bedca",
          "cabde",
          "cabed",
          "cadbe",
          "cadeb",
          "caebd",
          "caedb",
          "cbade",
          "cbaed",
          "cbdae",
          "cbdea",
          "cbead",
          "cbeda",
          "cdabe",
          "cdaeb",
          "cdbae",
          "cdbea",
          "cdeab",
          "cdeba",
          "ceabd",
          "ceadb",
          "cebad",
          "cebda",
          "cedab",
          "cedba",
          "dabce",
          "dabec",
          "dacbe",
          "daceb",
          "daebc",
          "daecb",
          "dbace",
          "dbaec",
          "dbcae",
          "dbcea",
          "dbeac",
          "dbeca",
          "dcabe",
          "dcaeb",
          "dcbae",
          "dcbea",
          "dceab",
          "dceba",
          "deabc",
          "deacb",
          "debac",
          "debca",
          "decab",
          "decba",
          "eabcd",
          "eabdc",
          "eacbd",
          "eacdb",
          "eadbc",
          "eadcb",
          "ebacd",
          "ebadc",
          "ebcad",
          "ebcda",
          "ebdac",
          "ebdca",
          "ecabd",
          "ecadb",
          "ecbad",
          "ecbda",
          "ecdab",
          "ecdba",
          "edabc",
          "edacb",
          "edbac",
          "edbca",
          "edcab",
          "edcba"
        )
      )
    }
  }
}
