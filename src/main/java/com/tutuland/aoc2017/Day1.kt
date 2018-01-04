package com.tutuland.aoc2017

val String.firstCaptchaSolution: String
    get() = solveCaptcha { i, c ->
        c.isDigit() && c == getCircularNextFrom(i)
    }

val String.secondCaptchaSolution: String
    get() = solveCaptcha { i, c ->
        c.isDigit() && c == getCircularNextWithStepFrom(i, size/2)
    }

fun String.solveCaptcha(satisfiesCondition: CharArray.(Int, Char) -> Boolean): String {
    var sum = 0

    if (length > 1) {
        toCharArray().apply {
            forEachIndexed { i, c ->
                if (satisfiesCondition(i, c))  sum += c.toString().toInt()
            }
        }
    }

    return sum.toString()
}