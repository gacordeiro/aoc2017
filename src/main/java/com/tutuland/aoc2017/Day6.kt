package com.tutuland.aoc2017

fun List<Int>.redistributeBlocks(): List<Int> = this.toMutableList().also { list ->
    var targetPosition = 0

    list.forEachIndexed { position, block -> if (block > list[targetPosition]) targetPosition = position }

    val blocksToRedistribute = list[targetPosition]
    list[targetPosition] = 0

    repeat(times = blocksToRedistribute) {
        targetPosition = list nextIndexFrom targetPosition
        list[targetPosition] = list[targetPosition] + 1
    }

    return list
}

fun calculatePossibleRedistributionsFor(initialDistribution: List<Int>): Int {
    var currentDistribution = initialDistribution
    val pastDistributions: MutableList<List<Int>> = mutableListOf()

    while (!pastDistributions.contains(currentDistribution)) {
        pastDistributions.add(currentDistribution)
        currentDistribution = currentDistribution.redistributeBlocks()
    }

    return pastDistributions.size
}

fun calculateRedistributionLoopSizeIn(initialDistribution: List<Int>): Int {
    var currentDistribution = initialDistribution
    val pastDistributions: MutableList<List<Int>> = mutableListOf()
    var firstOccurrence = -1

    while (firstOccurrence < 0) {
        pastDistributions.add(currentDistribution)
        currentDistribution = currentDistribution.redistributeBlocks()
        firstOccurrence = pastDistributions.indexOf(currentDistribution)
    }

    return pastDistributions.size - firstOccurrence
}