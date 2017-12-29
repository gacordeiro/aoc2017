package com.tutuland.aoc2017

import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldEqual
import org.junit.Test


class TestDay2 {
    @Test fun `calculateChecksum happy case validation`() {
        val array: List<List<Int>> = listOf(listOf(5,1,9,5),
                                            listOf(7,5,3),
                                            listOf(2,4,6,8))
        array.calculateChecksum() shouldEqual "18"
    }

    @Test fun `calculateChecksum for day2_input`() {
        day_2_input.calculateChecksum() shouldEqual "32121"
    }

    @Test fun `evenDivisibleDiference happy case validation`() {
        val array: List<List<Int>> = listOf(listOf(5,9,2,8),
                                            listOf(9,4,7,3),
                                            listOf(3,8,6,5))

        array[0].evenDivisibleDifference() shouldBe 4
        array[1].evenDivisibleDifference() shouldBe 3
        array[2].evenDivisibleDifference() shouldBe 2
    }

    @Test fun `calculateEvenlyDivisibleChecksum for day2_input`() {
        day_2_input.calculateEvenlyDivisibleChecksum() shouldEqual "197"
    }
}