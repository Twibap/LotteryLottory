package io.github.twibap.lottory.lottery

class Lottery {

    // last one is bonus number for 2nd
    private val numbers: Array<Ball?> = arrayOfNulls(6)
    private val bonus: Ball

    init {
        for (i in numbers.indices)
            numbers[i] = Ball(numbers)
        bonus = Ball(numbers)
        numbers.sort();
    }

    override fun toString(): String {
        this.numbers.toString()
        return "${numbers.contentToString()} + $bonus"
    }
}
