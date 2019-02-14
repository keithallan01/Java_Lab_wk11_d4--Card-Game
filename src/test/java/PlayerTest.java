import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Player player2;
    Card card;

    @Before
    public void before(){
        player1 = new Player();
        player2 = new Player();
        card = new Card(SuitType.SPADES, RankType.ACE);
    }

    @Test
    public void playerCanRecieveACard(){
        player1.takeCard(card);
        assertEquals(RankType.ACE, player1.showCard().getRank());
    }
}
