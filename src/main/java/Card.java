public class Card {

    private SuitType suit;
    private String rank;

    public Card(SuitType suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuit(){
        return this.suit;
    }

    public String getRank(){
        return this.rank;
    }
}
