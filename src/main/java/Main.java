public class Main {

    public static void main(String[] strings)
    {
        Card_1_c c1 = new Card_1_c(Card_1_c.Suit.diamonds, 2);
        System.out.println("Rank is " + c1.getRank());
        Card_1_c c2 = new Card_1_c(Card_1_c.Suit.diamonds);
        System.out.println("Rank is " + c2.getRank());
        Card_1_c c3 = new Card_1_c(Card_1_c.Suit.diamonds, 4);
        System.out.println("Rank is " + c3.getRank());
        Card_1_c c4 = new Card_1_c(Card_1_c.Suit.diamonds);
        System.out.println("Rank is " + c4.getRank());
    }
}
