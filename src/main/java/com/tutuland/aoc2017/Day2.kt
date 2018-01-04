package com.tutuland.aoc2017

inline fun <reified T: List<List<Int>>> T.calculateChecksum(): String {
    var sum = 0
    var min: Int
    var max: Int

    forEach { line ->
        if (line.size > 1) {
            min = Int.MAX_VALUE
            max = Int.MIN_VALUE
            line.forEach { x ->
                if (x < min) min = x
                if (x > max) max = x
            }
            sum += (max - min)
        }
    }

    return sum.toString()
}

inline fun <reified T: List<List<Int>>> T.calculateEvenlyDivisibleChecksum(): String {
    var sum = 0

    forEach { line ->
        if (line.size > 1) {
            sum += line.evenDivisibleDifference()
        }
    }

    return sum.toString()
}

inline fun <reified T: List<Int>> T.evenDivisibleDifference(): Int {
    var min: Int
    var max: Int
    forEachIndexed { i, x ->
        subList(i+1, size).forEach { y ->
            min = kotlin.math.min(x, y)
            max = kotlin.math.max(x, y)
            if (max % min == 0) return (max / min)
        }
    }
    return 0
}
