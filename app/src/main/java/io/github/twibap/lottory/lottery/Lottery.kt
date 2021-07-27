package io.github.twibap.lottory.lottery

class Lottery: Comparable<Lottery> {

    val num1: Ball = Ball()
    val num2: Ball = Ball()
    val num3: Ball = Ball()
    val num4: Ball = Ball()
    val num5: Ball = Ball()
    val num6: Ball = Ball()
    val numBonus: Ball = Ball()

    override fun toString(): String {
        return "${num1.value} / ${num2.value} / ${num3.value} / ${num4.value} / ${num5.value} / ${num6.value} + ${numBonus.value}"
    }

    /**
     * if return 0 is WINNER
     */
    override fun compareTo(other: Lottery): Int {
        return this.num1.compareTo(other.num1) or
                this.num2.compareTo(other.num2) or
                this.num3.compareTo(other.num3) or
                this.num4.compareTo(other.num4) or
                this.num5.compareTo(other.num5) or
                this.num6.compareTo(other.num6)
    }
}
