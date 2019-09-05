import java.util.ArrayList;

public class Dealer {

    public Dealer() {

    }


    public void drawCardsForPlayer(Player player, Deck deck) {
        player.receiveCard(deck);
    }

    public String checkForWinningCard(Player player1, Player player2) {
        if(player1.returnValue() > player2.returnValue())  {
            return "player1";
        } else if (player1.returnValue() < player2.returnValue()) {
            return "player2";
        } else {
            return "draw!";
        }
    }
}
