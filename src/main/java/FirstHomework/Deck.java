package FirstHomework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    List<Card_2> cards = new ArrayList<>();
    boolean joker = false;


    private Deck(int numberOfCards){
        if (numberOfCards==54) joker = true;
        else joker = false;
        fillDeck();
    }
    private void fillDeck(){
        for(int j =Card_2.Suit.Diamonds.ordinal();j<4 ;j++){
            for(int i=2; i<15; i++){
                cards.add(new Card_2(Card_2.Suit.values()[j],i));
            }
        }
        if (joker) {
            cards.add(new Card_2(Card_2.Suit.values()[2],15));
            cards.add(new Card_2(Card_2.Suit.values()[3],15));
        }
    }

    static Deck createDeck(int numberOfCards){
        if (numberOfCards==52 || numberOfCards==54) return new Deck(numberOfCards);
        return null;
    }

    static Card_2 getRandomCard(Deck deck){

        if(deck.joker) {
            int max = (int) (Math.random() * 15);
            return deck.cards.get(max);
        }else {
            int max = (int) (Math.random() * 14);
            return deck.cards.get(max);}
    }
    public void changeTheOrder (){
        Collections.shuffle(cards);
    }

    public void sortCards (){
    cards.sort((card_2, o) -> card_2.compareTo(o));
    }

    public Card_2 gettingCard(int card){
        return cards.remove(card);
    }
    public Card_2 gettingCard(Card_2 card1){
        int card = cards.indexOf(card1);
        return cards.remove(card);
    }

    public void addingCard(Card_2 card1){
        int card = cards.indexOf(card1);
        if(card<0) cards.add(card1);
    }
    public boolean empty(){
       return cards.isEmpty();
    }
    @Override
    public String toString() {
        String str="Начало колоды\n";
        for(Card_2 card: cards)
            str+=card.toString()+"\n";
        str+="Конец колоды\n";
        return str;
    }
}
