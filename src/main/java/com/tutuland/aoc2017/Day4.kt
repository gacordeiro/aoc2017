package com.tutuland.aoc2017

fun List<String>.countIfValidPassphrase(): Int {
    forEachIndexed { index, password ->
        if (subList(index+1, size).contains(password)) return 0
    }
    return 1
}

inline fun <reified T: List<List<String>>> T.countValidPassphrases(): Int {
    var sum = 0
    forEach { passphrase ->
        sum += passphrase.countIfValidPassphrase()
    }
    return sum
}

fun List<String>.countIfValidSecurePassphrase(): Int {
    forEachIndexed { index, password ->
        subList(index+1, size).forEach { nextWord ->
            if (password.toSortedCharArray() contentEquals nextWord.toSortedCharArray()) return 0
        }
    }
    return 1
}

inline fun <reified T: List<List<String>>> T.countValidSecurePassphrases(): Int {
    var sum = 0
    forEach { passphrase ->
        sum += passphrase.countIfValidSecurePassphrase()
    }
    return sum
}