import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card("Hearts", "five");
    }

    @Test
    public void hasSuit(){
        assertEquals("Hearts", card.getSuit());
    }

    @Test
    public void hasRank(){
        assertEquals("five", card.getRank());
    }
}
