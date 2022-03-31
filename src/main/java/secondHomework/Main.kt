package secondHomework

import secondHomework.Card1
import java.sql.DriverManager.println

fun main() {
    val c3 = Card1(Card1.Suit.Diamonds, 10)
    println("Rank is " + c3.rank)
    println(c3.toString())
    val c4 = Card1(Card1.Suit.Diamonds)
    println("Rank is " + c4.rank)
    println(c4.toString())
    val c5 = Card1(Card1.Suit.Diamonds)
    println("Rank is " + c5.rank)
    println(c5.toString())
    val c6 = Card1(Card1.Suit.Diamonds)
    println("Rank is " + c6.rank)
    println(c6.toString())
    val c7 = Card1(Card1.Suit.Diamonds)
    println("Rank is " + c7.rank)
    println(c7.toString())
}