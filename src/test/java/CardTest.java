import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, "five");
    }

    @Test
    public void hasSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void hasRank(){
        assertEquals("five", card.getRank());
    }
}
