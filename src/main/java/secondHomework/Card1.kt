package secondHomework

class Card1 {
    operator fun compareTo(o: Any): Int {
        val card2 = o as Card1
        if (this == card2) return 0
        return if (this.suitPower(card2) > 0 || rankPower(card2)) 1 else -1
    }

    enum class Suit {
        Clubs, Diamonds, Spades, Hearts
    }

    var rank: Int
        private set
    var suit: Suit
        private set

    constructor(suit: Suit, rank: Int) {
        this.rank = rank
        this.suit = suit
        idCard++
        if (rank > maxRank) maxRank = rank
    }

    constructor(suit: Suit) {
        this.suit = suit
        rank = maxRank + 1
        idCard++
        maxRank++
    }

    override fun toString(): String {
        when (rank) {
            2, 3, 4, 5, 6, 7, 8, 9, 10 -> return "$rank $suit Without type"
            11 -> return "$rank $suit Jack"
            12 -> return "$rank $suit Queen"
            13 -> return "$rank $suit King"
            14 -> return "$rank $suit Ace"
            15 -> return rank.toString() + " " + suit + "Joker"
        }
        return "Карта не принадлежит к стандартной колоде в 54 карты"
    }

    override fun hashCode(): Int {
        return idCard
    }

    override fun equals(obj: Any?): Boolean {
        if (obj !is Card1) return false
        val card2 = obj
        return card2.suit == suit && card2.rank == rank
    }

    fun availabilityInTheDeck(): Boolean {
        return if (rank == 15 && suit.ordinal < 2) false else 1 < rank && rank < 16
    }

    fun rankPower(card2: Card1): Boolean {
        return card2.suit == suit && card2.rank < rank
    }

    fun suitPower(card2: Card1): Int {
        return if (suit.ordinal > card2.suit.ordinal) 1 else if (suit.ordinal < card2.suit.ordinal) -1 else 0
    }

    companion object {
        var maxRank = 1
        var idCard = 0
        fun suitPower(card2: Card1, card1: Card1): Int {
            return if (card2.suit.ordinal > card1.suit.ordinal) 1 else if (card2.suit.ordinal < card1.suit.ordinal) -1 else 0
        }
    }
}