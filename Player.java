import java.util.List;

public class Player {
    private String name;
    private List<Card>hand;
    private int score;

    public Player(String name, List<Card> hand) {
        this.name = name;
        this.hand = hand;
        this.score = 0;
    }
    public void drawCard(Deck deck) {
        Card drawn = deck.draw();
        if (drawn != null) {
            hand.add(drawn);
        }
    }

    public boolean playCard(Card card, Game game) {
        if (game.playCard(this, card)) {
            hand.remove(card);
            return true;
        }
        return false;
    }

    public void showHand() {
        System.out.println(name + "'s hand is " + hand);
    }

    public void addScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }


}
