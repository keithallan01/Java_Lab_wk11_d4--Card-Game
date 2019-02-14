import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void hasEmptyListOfCards(){
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void canAddCardToList(){
        card = new Card(SuitType.SPADES, RankType.ACE);
        deck.addCard(card);
        assertEquals(1, deck.cardCount());
    }

    @Test
    public void canPopualateDeck(){
        deck.populate();
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void dealCard(){
        deck.populate();
        Card mycard = deck.deal();
//        System.out.println(mycard);
        assertEquals(51, deck.cardCount());
    }
}
