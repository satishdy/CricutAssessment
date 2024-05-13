package com.satish.cricutassesment

/*
Available Slots (row, col)
00 01 02
10 11 12
20 21 22
*/

// Wining combinations
val wins = arrayOf(
    "000102",
    "101112",
    "202122",
    "001020",
    "011121",
    "021222",
    "001122",
    "021120"
)

var input = arrayOf<String>()

fun hasWon(row: Int, col: Int): Boolean {
    val slot = row.toString().plus(col.toString())
    input += slot

    // Sorts the array and joins them into a string
    val inputString = input.sorted().joinToString("")

    println(inputString)

    if (input.size >= 3) {
        wins.forEach {
            if (inputString.contains(it)) {
                println("Winner!")
                return true
            }
        }
    }
    return false
}

// Example Usage
fun main() {
    var hasWon = false

    // First Input
    hasWon = hasWon(0, 0)
    println("Has Won = $hasWon")

    // Second Input
    hasWon = hasWon(1, 1)
    println("Has Won = $hasWon")

    // Third Input
    hasWon = hasWon(2, 2)
    println("Has Won = $hasWon")
}