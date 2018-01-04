package com.tutuland.aoc2017

fun CharArray.getCircularNextFrom(index: Int): Char = getCircularNextWithStepFrom(index, 1)
fun CharArray.getCircularNextWithStepFrom(index: Int, step: Int): Char =
        when {
            index >= size -> throw ArrayIndexOutOfBoundsException("Invalid position")
            index + step > size - 1 -> this[index + step - size]
            else -> this[index+step]
        }

data class Coordinate(val x: Int, val y: Int)

fun String.toSortedCharArray() = toCharArray().apply(CharArray::sort)

fun MutableList<*>.canJumpCertainSteps(position: Int, steps: Int): Boolean = (position + steps) in 0 until size