import java.util.ArrayList;

public class Player {

    private ArrayList<Card> dealtCard;
    private RankType rank;

    public Player() {
        this.dealtCard = new ArrayList<Card>();
        this.rank = rank;
    }

    public int returnValue() {
        return this.rank.getValue();
    }


    public int amountOfCards() {
        return dealtCard.size();
    }

    public void receiveCard(Deck deck) {
        Card card = deck.dealCard();
        this.dealtCard.add(card);
    }
}
