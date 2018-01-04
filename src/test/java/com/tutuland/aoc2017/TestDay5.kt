package com.tutuland.aoc2017

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class TestDay5 {
    @Test fun `countStepsToEscapeMaze happy case validation`() {
        mutableListOf(0,3,0,1,-3).countStepsToEscapeMaze() shouldEqualTo 5
    }

    @Test fun `countStepsToEscapeMaze for inputForDay5`() {
        inputForDay5().countStepsToEscapeMaze() shouldEqualTo 355965
    }

    @Test fun `countStepsToEscapeStrangerMaze happy case validation`() {
        mutableListOf(0,3,0,1,-3).countStepsToEscapeStrangerMaze() shouldEqualTo 10
    }

    @Test fun `countStepsToEscapeStrangerMaze for inputForDay5`() {
        inputForDay5().countStepsToEscapeStrangerMaze() shouldEqualTo 26948068
    }
}