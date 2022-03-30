package FirstHomework;

public class Card_1_c{

    enum Suit{
        diamonds,
        clubs,
        hearts,
        spade
    }
    private int rank;
    private Suit suit;
    static int maxRank=1;
    public Card_1_c(Suit suit, int rank){
        this.rank = rank;
        this.suit = suit;
        if(rank > maxRank) maxRank = rank;
    }
    public Card_1_c(Suit suit){
        this.suit = suit;
        rank = maxRank+1;
        maxRank++;
    }
    public Suit getSuit(){
        return suit;
    }
    public int getRank(){
        return rank;
    }
}
