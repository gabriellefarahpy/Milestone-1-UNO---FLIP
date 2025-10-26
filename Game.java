import java.util.List;
public class Game{
    private List<Player> players;
    private int currentPlayerIndex;
    private boolean isClockwise;
    private Deck deck;


    public void startGame(){
        deck = new Deck();
        deck.shuffle();
        for (Players s : players){
            for (int i = 0, i < 8; i++){
                s.drawCard(Deck);
            }
        }
        Card firstCard = deck.draw();
        deck.discared(firstCard);

        currentPlayerIndex = 0;
        isClockwise = true;

        System.out.println("Starting Card:"+ firstCard);
        displayGameState();
    }

    public void nextTurn(){
        if (isClockwise == true){
            currentPlayerIndex++;
        } else{
            currentPlayerIndex--;
        }

    }
    public boolean playCard(Player player, Card card){

    }

    public void drawCard(Player player){
        
    }

    public boolean isValidPlay(Card card){

    }
    public void applyAction(Card card){

    }
    public void updateScore(Player player, int points){

    }
    public void displayGameState(){
        
    }

}