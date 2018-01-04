package com.tutuland.aoc2017

import org.amshove.kluent.shouldEqual
import org.junit.Test


class TestDay1 {
    @Test fun `firstCaptchaSolution invalid cases validation`() {
        "abc".firstCaptchaSolution shouldEqual "0"
        "1".firstCaptchaSolution shouldEqual "0"
        "".firstCaptchaSolution shouldEqual "0"
    }

    @Test fun `firstCaptchaSolution valid cases validation`() {
        "1122".firstCaptchaSolution shouldEqual "3"
        "1111".firstCaptchaSolution shouldEqual "4"
        "1234".firstCaptchaSolution shouldEqual "0"
        "91212129".firstCaptchaSolution shouldEqual "9"
    }

    @Test fun `firstCaptchaSolution for day1_input`() {
        day1_input.firstCaptchaSolution shouldEqual "1047"
    }

    @Test fun `secondCaptchaSolution invalid cases validation`() {
        "abc".secondCaptchaSolution shouldEqual "0"
        "1".secondCaptchaSolution shouldEqual "0"
        "".secondCaptchaSolution shouldEqual "0"
    }

    @Test fun `secondCaptchaSolution valid cases validation`() {
        "1212".secondCaptchaSolution shouldEqual "6"
        "1221".secondCaptchaSolution shouldEqual "0"
        "123425".secondCaptchaSolution shouldEqual "4"
        "123123".secondCaptchaSolution shouldEqual "12"
        "12131415".secondCaptchaSolution shouldEqual "4"
    }

    @Test fun `secondCaptchaSolution for day1_input`() {
        day1_input.secondCaptchaSolution shouldEqual "982"
    }
}