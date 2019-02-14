import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.FIVE);
    }

    @Test
    public void hasSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.FIVE, card.getRank());
    }

}
