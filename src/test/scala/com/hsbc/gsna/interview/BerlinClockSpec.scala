package com.hsbc.gsna.interview

import org.scalatest.{FlatSpec, Matchers}

class BerlinClockSpec extends FlatSpec with Matchers {
  "Dummy Berlin clock" should "present time" in {
    DummyBerlinClock.convert("12:59:23") should contain theSameElementsInOrderAs Seq(
                                                                                              "Y",
                                                                                              "RROO",
                                                                                              "RROO",
                                                                                              "YYRYYRYYRYY",
                                                                                              "YYYY"
                                                                                            )
  }

  "Berlin clock" should "present time" in {
    BerlinClockFull.convert("12:59:23") should contain theSameElementsInOrderAs Seq(
      "Y",
      "RROO",
      "RROO",
      "YYRYYRYYRYY",
      "YYYY"
    )
  }


}

object DummyBerlinClock extends BerlinClock {
  override def convert(time: String): Seq[String] = {
    Seq(
      "Y",
      "RROO",
      "RROO",
      "YYRYYRYYRYY",
      "YYYY"
    )
  }
}
