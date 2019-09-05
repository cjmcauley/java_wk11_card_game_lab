import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        this.deck = new ArrayList<Card>();
    }

    public int amountOfCards() {
        return deck.size();
    }

    public void populateDeck() {
        for(SuitType suit : SuitType.values()){
            for(RankType rank : RankType.values()){
                Card card = new Card(suit, rank);
                this.deck.add(card);
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(this.deck);
    }

    public Card dealCard() {
       return this.deck.remove(0);
    }



}
