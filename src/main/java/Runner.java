public class Runner {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.populateDeck();
        deck.shuffleDeck();
        System.out.println(deck);
    }
}
