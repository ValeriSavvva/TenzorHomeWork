package FirstHomework;

public class Card_1_b {
    enum Suit{
        diamonds,
        clubs,
        hearts,
        spade
    }
    private int rank;
    private Suit suit;
    public Card_1_b (int rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }
    public Suit getSuit(){
        return suit;
    }
    public int getRank(){
        return rank;
    }
}
