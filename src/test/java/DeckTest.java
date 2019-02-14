import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;
    Card card;
    Card unshuffledCard;
    Card shuffledCard;

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
        unshuffledCard = deck.deal();
        System.out.println(unshuffledCard.getSuit().toString() + unshuffledCard.getRank().toString());
        assertEquals(51, deck.cardCount());
    }

    @Test
    public void canShuffleDeck(){
        deck.populate();
        deck.shuffle();
        shuffledCard = deck.deal();
        System.out.println(shuffledCard.getSuit().toString() + shuffledCard.getRank().toString());

        assertNotEquals(shuffledCard, unshuffledCard);
    }
}
