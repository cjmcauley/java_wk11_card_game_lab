import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;


    @Before
    public void before() {
        deck = new Deck();
        player = new Player();
    }


    @Test
    public void playerRecievesCard() {
        deck.populateDeck();
        deck.shuffleDeck();
        player.receiveCard(deck);
        assertEquals(1, player.amountOfCards());
    }

}
