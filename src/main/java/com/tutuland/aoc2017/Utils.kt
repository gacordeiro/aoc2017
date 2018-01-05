package com.tutuland.aoc2017

infix fun CharArray.getCircularNextFrom(index: Int): Char = getCircularNextWithStepFrom(index, 1)
fun CharArray.getCircularNextWithStepFrom(index: Int, step: Int): Char =
        when {
            index >= size -> throw ArrayIndexOutOfBoundsException("Invalid position")
            index + step > size - 1 -> this[index + step - size]
            else -> this[index+step]
        }

infix fun List<*>.nextIndexFrom(index: Int): Int = nextIndexWithStepFrom(index, 1)
fun List<*>.nextIndexWithStepFrom(index: Int, step: Int): Int =
        if (index + step > size - 1) index + step - size else index + step

data class Coordinate(val x: Int, val y: Int)

fun String.toSortedCharArray() = toCharArray().apply(CharArray::sort)

fun MutableList<*>.canJumpCertainSteps(position: Int, steps: Int): Boolean = (position + steps) in 0 until size