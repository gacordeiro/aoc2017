package com.tutuland.aoc2017

const val day3_input: Int = 277678

fun findEnclosingSquareSideFor(num: Int): Int {
    var i = 1
    while (i*i < num) i += 2
    return i
}

fun calculateSpiralDistanceFor(num: Int): Int {
    if (num < 2) return 0

    val squareSide: Int = findEnclosingSquareSideFor(num)
    val squareSteps: Int = (4 * squareSide) - 4
    val distanceFromEnd: Int = (squareSide * squareSide) - num
    val numSteps: Int = squareSteps - distanceFromEnd
    val radius: Int = (squareSide/2)
    val quotient = numSteps/radius
    val remainder = numSteps%radius

    return if (quotient % 2 == 0) radius + (radius - remainder) else radius + remainder
}

data class Coordinate(val x: Int, val y: Int)

fun getInitialSpiralMap(): MutableMap<Coordinate, Int> = mutableMapOf(Coordinate(0, 0) to 1)

fun MutableMap<Coordinate, Int>.calculate(position: Coordinate): Int {
    var sum = 0
    for (x in (position.x - 1)..(position.x + 1)) {
        for (y in (position.y - 1)..(position.y + 1)) {
            sum += this[Coordinate(x,y)] ?: 0
        }
    }
    this[position] = sum
    return sum
}

fun findNextInSpiralFor(num: Int): Int {
    val spiral: MutableMap<Coordinate, Int> = getInitialSpiralMap()
    var next = 1
    var radius = 1
    while (next < num) {
        for (y in ((-1 * radius) + 1) until radius) {
            next = spiral.calculate(Coordinate(radius, y))
            if (next > num) return next
        }
        for (x in radius downTo (-1 * radius)) {
            next = spiral.calculate(Coordinate(x, radius))
            if (next > num) return next
        }
        for (y in (radius - 1) downTo (-1 * radius)) {
            next = spiral.calculate(Coordinate((-1 * radius), y))
            if (next > num) return next
        }
        for (x in ((-1 * radius) + 1) until (radius + 1)) {
            next = spiral.calculate(Coordinate(x, (-1 * radius)))
            if (next > num) return next
        }
        radius++
    }
    return next
}
