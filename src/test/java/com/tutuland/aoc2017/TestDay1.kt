package com.tutuland.aoc2017

import org.amshove.kluent.shouldEqual
import org.junit.Test
import kotlin.test.assertFailsWith


class TestDay1 {
    @Test fun `getCircularNextFrom happy case validation`() {
        "abc".toCharArray().apply {
            getCircularNextFrom(0) shouldEqual 'b'
            getCircularNextFrom(1) shouldEqual 'c'
            getCircularNextFrom(2) shouldEqual 'a'
        }
    }

    @Test fun `getCircularNextFrom fails with ArrayIndexOutOfBoundsException if index is greater than size`() {
        "abc".toCharArray().apply {
            assertFailsWith<ArrayIndexOutOfBoundsException> { getCircularNextFrom(3) }
        }
    }

    @Test fun `getCircularNextWithStepFrom half the size happy case validation`() {
        "abcdef".toCharArray().apply {
            getCircularNextWithStepFrom(0, size/2) shouldEqual 'd'
            getCircularNextWithStepFrom(1, size/2) shouldEqual 'e'
            getCircularNextWithStepFrom(2, size/2) shouldEqual 'f'
            getCircularNextWithStepFrom(3, size/2) shouldEqual 'a'
            getCircularNextWithStepFrom(4, size/2) shouldEqual 'b'
            getCircularNextWithStepFrom(5, size/2) shouldEqual 'c'
        }
    }

    @Test fun `getCircularNextWithStepFrom half the size fails with ArrayIndexOutOfBoundsException if index is greater than size`() {
        "abcdef".toCharArray().apply {
            assertFailsWith<ArrayIndexOutOfBoundsException> { getCircularNextWithStepFrom(6, size/2) }
        }
    }

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