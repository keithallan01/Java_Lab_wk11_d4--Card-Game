import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cardList;

    public Deck(){
        cardList = new ArrayList<>();
    }

    public int cardCount(){
        return this.cardList.size();
    }


}
