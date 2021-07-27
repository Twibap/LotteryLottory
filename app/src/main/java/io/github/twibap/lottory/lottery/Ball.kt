package io.github.twibap.lottory.lottery

class Ball: Comparable<Ball> {

    var value: Int

    init {
        var randomVal: Double
        do {
            randomVal = Math.random();
            this.value = (randomVal* MAX_VALUE).toInt() + 1
        } while (value !in MIN_VALUE..MAX_VALUE)
    }

    companion object {
        const val MIN_VALUE = 1
        const val MAX_VALUE = 45
    }

    override fun compareTo(other: Ball): Int {
        return this.value - other.value
    }

}