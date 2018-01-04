package com.tutuland.aoc2017

import org.amshove.kluent.shouldEqual
import org.amshove.kluent.shouldEqualTo
import org.amshove.kluent.shouldNotEqual
import org.junit.Test
import kotlin.test.assertFailsWith

class TestUtils {
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
            getCircularNextWithStepFrom(0, size / 2) shouldEqual 'd'
            getCircularNextWithStepFrom(1, size / 2) shouldEqual 'e'
            getCircularNextWithStepFrom(2, size / 2) shouldEqual 'f'
            getCircularNextWithStepFrom(3, size / 2) shouldEqual 'a'
            getCircularNextWithStepFrom(4, size / 2) shouldEqual 'b'
            getCircularNextWithStepFrom(5, size / 2) shouldEqual 'c'
        }
    }

    @Test fun `getCircularNextWithStepFrom half the size fails with ArrayIndexOutOfBoundsException if index is greater than size`() {
        "abcdef".toCharArray().apply {
            assertFailsWith<ArrayIndexOutOfBoundsException> { getCircularNextWithStepFrom(6, size / 2) }
        }
    }

    @Test fun `toSortedCharArray happy case validation`() {
        "abc".toSortedCharArray() shouldEqual "abc".toSortedCharArray()
        "ecdab".toSortedCharArray() shouldEqual "abcde".toSortedCharArray()
        "ecdab".toSortedCharArray() shouldNotEqual "abcdef".toSortedCharArray()
    }

    @Test fun `canJumpCertainSteps happy case validation`() {
        mutableListOf(0,3,0,1,-3).apply {
            canJumpCertainSteps(0, 0) shouldEqualTo true
            canJumpCertainSteps(0, 2) shouldEqualTo true
            canJumpCertainSteps(0, 4) shouldEqualTo true
            canJumpCertainSteps(0, 5) shouldEqualTo false
            canJumpCertainSteps(0, -1) shouldEqualTo false
            canJumpCertainSteps(4, -4) shouldEqualTo true
            canJumpCertainSteps(4, -5) shouldEqualTo false
        }
    }
}