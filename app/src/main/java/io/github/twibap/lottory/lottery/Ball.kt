package io.github.twibap.lottory.lottery

class Ball(numbers: Array<Ball?>) : Comparable<Ball> {

    var value: Int

    init {
        var randomVal: Double
        do {
            randomVal = Math.random();
            this.value = (randomVal* MAX_VALUE).toInt() + MIN_VALUE
        } while (value in numbers.map { ball -> ball?.value })
    }

    companion object {
        const val MIN_VALUE = 1
        const val MAX_VALUE = 45
    }

    override fun compareTo(other: Ball): Int {
        return this.value - other.value
    }

    override fun toString(): String {
        return "($value)"
    }

}