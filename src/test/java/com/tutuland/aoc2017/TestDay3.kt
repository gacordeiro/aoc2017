package com.tutuland.aoc2017

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class TestDay3 {
    @Test fun `calculateSpiralDistanceFor happy case validation`() {
        calculateSpiralDistanceFor(1) shouldEqualTo 0
        calculateSpiralDistanceFor(12) shouldEqualTo 3
        calculateSpiralDistanceFor(23) shouldEqualTo 2
        calculateSpiralDistanceFor(1024) shouldEqualTo 31
    }

    @Test fun `calculateSpiralDistanceFor day3_input`() {
        calculateSpiralDistanceFor(day3_input) shouldEqualTo 475
    }

    @Test fun `calculateInSpiral(position) happy case validation`() {
        val spiral: MutableMap<Coordinate, Int> = getInitialSpiralMap()
        spiral.calculateInSpiral(Coordinate(0,0)) shouldEqualTo 1
        spiral.calculateInSpiral(Coordinate(1,0)) shouldEqualTo 1
        spiral.calculateInSpiral(Coordinate(1,1)) shouldEqualTo 2
        spiral.calculateInSpiral(Coordinate(0,1)) shouldEqualTo 4
        spiral.calculateInSpiral(Coordinate(-1,1)) shouldEqualTo 5
        spiral.calculateInSpiral(Coordinate(-1,0)) shouldEqualTo 10
        spiral.calculateInSpiral(Coordinate(-1,-1)) shouldEqualTo 11
        spiral.calculateInSpiral(Coordinate(0,-1)) shouldEqualTo 23
        spiral.calculateInSpiral(Coordinate(1,-1)) shouldEqualTo 25
        spiral.calculateInSpiral(Coordinate(2,-1)) shouldEqualTo 26
        spiral.calculateInSpiral(Coordinate(2,0)) shouldEqualTo 54
        spiral.calculateInSpiral(Coordinate(2,1)) shouldEqualTo 57
        spiral.calculateInSpiral(Coordinate(2,2)) shouldEqualTo 59
        spiral.calculateInSpiral(Coordinate(1,2)) shouldEqualTo 122
        spiral.calculateInSpiral(Coordinate(0,2)) shouldEqualTo 133
        spiral.calculateInSpiral(Coordinate(-1,2)) shouldEqualTo 142
        spiral.calculateInSpiral(Coordinate(-2,2)) shouldEqualTo 147
    }

    @Test fun `findNextInSpiralFor happy case validation`() {
        findNextInSpiralFor(800) shouldEqualTo 806
        findNextInSpiralFor(806) shouldEqualTo 880
    }

    @Test fun `findNextInSpiralFor day3_input`() {
        findNextInSpiralFor(277678) shouldEqualTo 279138
    }
}