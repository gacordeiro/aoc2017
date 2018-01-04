package com.tutuland.aoc2017

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class TestDay4 {
    @Test fun `countIfValidPassphrase happy case validation`() {
        "aa bb cc dd ee".split(" ").countIfValidPassphrase() shouldEqualTo 1
        "aa bb cc dd aa".split(" ").countIfValidPassphrase() shouldEqualTo 0
        "aa bb cc dd aaa".split(" ").countIfValidPassphrase() shouldEqualTo 1
    }

    @Test fun `countValidPassphrases for inputForDay4`() {
        inputForDay4.countValidPassphrases() shouldEqualTo 386
    }

    @Test fun `countIfValidSecurePassphrase happy case validation`() {
        "abcde fghij".split(" ").countIfValidSecurePassphrase() shouldEqualTo 1
        "abcde xyz ecdab".split(" ").countIfValidSecurePassphrase() shouldEqualTo 0
        "a ab abc abd abf abj".split(" ").countIfValidSecurePassphrase() shouldEqualTo 1
        "iiii oiii ooii oooi oooo".split(" ").countIfValidSecurePassphrase() shouldEqualTo 1
        "oiii ioii iioi iiio".split(" ").countIfValidSecurePassphrase() shouldEqualTo 0
    }

    @Test fun `countValidSecurePassphrases for inputForDay4`() {
        inputForDay4.countValidSecurePassphrases() shouldEqualTo 208
    }
}