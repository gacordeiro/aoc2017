package com.tutuland.aoc2017

import org.amshove.kluent.shouldEqual
import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class TestDay6 {
    @Test fun `redistributeBlocks happy case validation`() {
        mutableListOf(0,2,7,0).redistributeBlocks() shouldEqual mutableListOf(2,4,1,2)
        mutableListOf(2,4,1,2).redistributeBlocks() shouldEqual mutableListOf(3,1,2,3)
        mutableListOf(3,1,2,3).redistributeBlocks() shouldEqual mutableListOf(0,2,3,4)
        mutableListOf(0,2,3,4).redistributeBlocks() shouldEqual mutableListOf(1,3,4,1)
        mutableListOf(1,3,4,1).redistributeBlocks() shouldEqual mutableListOf(2,4,1,2)
    }

    @Test fun `calculatePossibleRedistributionsFor happy case validation`() {
        calculatePossibleRedistributionsFor(listOf(0,2,7,0)) shouldEqualTo 5
    }

    @Test fun `calculatePossibleRedistributionsFor for inputForDay6`() {
        calculatePossibleRedistributionsFor(inputForDay6) shouldEqualTo 3156
    }

    @Test fun `calculateRedistributionLoopSizeIn happy case validation`() {
        calculateRedistributionLoopSizeIn(listOf(0,2,7,0)) shouldEqualTo 4
    }

    @Test fun `calculateRedistributionLoopSizeIn for inputForDay6`() {
        calculateRedistributionLoopSizeIn(inputForDay6) shouldEqualTo 1610
    }
}