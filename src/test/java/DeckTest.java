import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void canGetEmptyArray(){
        assertEquals(0, deck.amountOfCards());
    }

    @Test
    public void canGetDeckOfCards(){
        deck.populateDeck();
        assertEquals(52, deck.amountOfCards());
    }
    @Test
    public void canShuffleCards(){
        deck.populateDeck();
        deck.shuffleDeck();
        assertEquals(52, deck.amountOfCards());
    }
    @Test
    public void canCompareTwoDecks(){
        deck.populateDeck();
        deck.shuffleDeck();
        assertEquals(52, deck.amountOfCards());
    }

    @Test
    public void canDealCard(){
        deck.populateDeck();
        deck.dealCard();
        deck.dealCard();
        assertEquals(50, deck.amountOfCards());
    }
}
