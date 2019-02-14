import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cardList;

    public Deck(){
        cardList = new ArrayList<>();
    }

    public int cardCount(){
        return this.cardList.size();
    }

    public void addCard(Card card){
        this.cardList.add(card);
    }

    public void populate(){
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()) {
                Card card = new Card(suit, rank);
                this.addCard(card);
//                System.out.println(card.getSuit().toString() + card.getRank().toString());
            }
        }
    }

    public Card deal(){
        return this.cardList.remove(0);
    }

    public void shuffle(){
        Collections.shuffle(cardList);
    }
}
