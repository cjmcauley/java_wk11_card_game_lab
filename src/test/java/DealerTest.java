import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Deck deck;
    Player player1;
    Player player2;

    @Before
    public void before() {
        dealer = new Dealer();
        deck = new Deck();
        deck.populateDeck();
        player1 = new Player();
        player2 = new Player();
    }

    @Test
    public void canDrawCards() {
        deck.shuffleDeck();
        dealer.drawCardsForPlayer(player1, deck);
        dealer.drawCardsForPlayer(player2, deck);
       assertEquals(50, deck.amountOfCards());
       assertEquals(1, player1.amountOfCards());
       assertEquals(1, player2.amountOfCards());
    }

    @Test
    public void checkForWinningCard() {
        dealer.drawCardsForPlayer(player1, deck);
        dealer.drawCardsForPlayer(player2, deck);
        assertEquals("player2", dealer.checkForWinningCard(player1, player2));
    }


}
