public class Main_2{
        public static void main(String[] strings)
        {
            Card_2 c3 = new Card_2(Card_2.Suit.Diamonds, 10);
            System.out.println("Rank is " + c3.getRank());
            System.out.println(c3.toString());
            Card_2 c4 = new Card_2(Card_2.Suit.Diamonds);
            System.out.println("Rank is " + c4.getRank());
            System.out.println(c4.toString());
            Card_2 c5 = new Card_2(Card_2.Suit.Diamonds);
            System.out.println("Rank is " + c5.getRank());
            System.out.println(c5.toString());
            Card_2 c6 = new Card_2(Card_2.Suit.Diamonds);
            System.out.println("Rank is " + c6.getRank());
            System.out.println(c6.toString());
            Card_2 c7 = new Card_2(Card_2.Suit.Diamonds);
            System.out.println("Rank is " + c7.getRank());
            System.out.println(c7.toString());
        }
}
