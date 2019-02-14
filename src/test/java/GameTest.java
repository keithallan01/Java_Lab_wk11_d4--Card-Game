import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    Card card1;
    Card card2;

    @Before
    public void before(){

        player1 = new Player();
        player2 = new Player();
        game = new Game(player1, player2);
        card1 = new Card(SuitType.CLUBS, RankType.EIGHT);
        card2 = new Card(SuitType.SPADES, RankType.QUEEN);
    }

    @Test
    public void canDetermineWinner(){
        player1.takeCard(card1);
        player2.takeCard(card2);
        assertEquals(player2, game.findWinner());
    }



}
