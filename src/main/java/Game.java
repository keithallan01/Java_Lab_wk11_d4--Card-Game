public class Game {
    private Player player1;
    private Player player2;
    private Deck deck;

    public Game(Player player1, Player player2){
        deck = new Deck();
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player findWinner(){
        int player1result = this.player1.showCard().getRank().getValue();
        int player2result = this.player2.showCard().getRank().getValue();

        if (player1result > player2result) {
            return player1;
        }
        else if (player2result > player1result) {
            return player2;
        } else {
            return null;
        }
    }

    public String itsADraw(){
        return "It's a Draw";
    }



}
