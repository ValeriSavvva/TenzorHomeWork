package FirstHomework;

public class Card_2 implements Comparable{

    @Override
    public int compareTo(Object o) {
        Card_2 card2 = (Card_2)o;
        if (this.equals(card2)) return 0;
        if (this.suitPower(card2)>0 || this.rankPower(card2)) return 1;
        else return -1;
    }

    enum Suit{
        Clubs,
        Diamonds,
        Spades,
        Hearts
    }

    private int rank;
    private Suit suit;
    static int maxRank=1;
    static int idCard=0;

    public Card_2(Suit suit, int rank){
        this.rank = rank;
        this.suit = suit;
        idCard++;
        if(rank > maxRank) maxRank = rank;
    }

    public Card_2(Suit suit){
        this.suit = suit;
        rank = maxRank+1;
        idCard++;
        maxRank++;
    }

    public Suit getSuit(){
        return suit;
    }

    public int getRank(){
        return rank;
    }

    @Override
    public String toString() {
        switch (rank)
        {
        case 2,3,4,5,6,7,8,9,10:
            return rank + " "+ suit + " Without type";
        case 11:
            return rank + " "+ suit + " Jack";
        case 12:
            return rank + " "+ suit + " Queen";
        case 13:
            return rank + " "+ suit + " King";
        case 14:
            return rank + " "+ suit + " Ace";
        case 15:
            return rank + " "+ suit + "Joker";
        }
        return "Карта не принадлежит к стандартной колоде в 54 карты";
    }

    @Override
    public int hashCode() {
        return idCard;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Card_2)) return false;
        Card_2 card2 = (Card_2)obj;
        return card2.suit==this.suit && card2.rank==this.rank;
    }

    public boolean availabilityInTheDeck() {
        if(rank==15&& suit.ordinal()<2)return false;
        return 1<rank && rank<16;
    }
    public boolean rankPower(Card_2 card2) {
        return card2.suit==this.suit && card2.rank<this.rank;
    }
    public int suitPower(Card_2 card2) {
        if(this.suit.ordinal()>card2.suit.ordinal())return 1;
            else if(this.suit.ordinal()<card2.suit.ordinal()) return -1;
                else return 0;
    }
    static int suitPower(Card_2 card2,Card_2 card1 ) {
        if(card2.suit.ordinal()>card1.suit.ordinal())return 1;
        else if(card2.suit.ordinal()<card1.suit.ordinal()) return -1;
        else return 0;
    }
}
