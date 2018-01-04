package com.tutuland.aoc2017

fun MutableList<Int>.countStepsToEscapeMaze(): Int =
        countStepsToEscapeMazeWithCondition { 1 }

fun MutableList<Int>.countStepsToEscapeStrangerMaze(): Int =
        countStepsToEscapeMazeWithCondition { steps -> if (steps >= 3) -1 else 1 }


fun MutableList<Int>.countStepsToEscapeMazeWithCondition(conditionalIncrementFor: (Int) -> Int): Int {
    var stepCount = 1
    var position = 0
    var steps = this[position]

    while (canJumpCertainSteps(position, steps)) {
        this[position] = this[position] + conditionalIncrementFor(steps)
        position += steps
        steps = this[position]
        stepCount++
    }

    return stepCount
}