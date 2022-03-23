public class Main_3 {
    /*


Напишите программу, в которой создаётся колода, раздаются несколько карт, какие-то
из них возвращаются, некоторые пробуем вернуть дважды. Выведите содержимое
колоды.

Перемешайте, и выведите содержимое, затем отсортируйте и снова выведите.
В цикле извлекайте карты, пока колода не окажется пустой. Выведите содержимое на
экран.

 */
    public static void main(String[] strings)
    {
        Deck d = Deck.createDeck(54);//Передаем количество карт в колоде
        System.out.println(d.toString());
        Card_2 card1 = d.gettingCard(1);
        Card_2 card4 = d.gettingCard(4);
        Card_2 card5 = d.gettingCard(5);
        System.out.println("Забрали из колоды следующие карты\n" + card1 + "\n" + card4 + "\n" + card5);
        System.out.println(d.toString());
        d.addingCard(card1);
        d.addingCard(card4);
        d.addingCard(card4);
        System.out.println("Положили в колоду следующие карты\n" + card1 + "x2 \n" + card4 + "\n");
        System.out.println(d.toString());
        System.out.println("Размешали колоду\n");
        d.changeTheOrder();
        System.out.println(d.toString());
        System.out.println("Отсортировали колоду\n");
        d.sortCards();
        System.out.println(d.toString());

    }

}
