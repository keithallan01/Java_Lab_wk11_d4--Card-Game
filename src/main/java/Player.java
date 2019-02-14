public class Player {
    private Card card;

    public Player(){
    }

    public Card showCard(){
        return this.card;
    }

    public void takeCard(Card card){
        this.card = card;
    }

}
