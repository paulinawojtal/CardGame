import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> playerCards;

    public Player(String name){
        this.name = name;
        playerCards = new ArrayList<>();
    }

    public List<Card> getPlayerCards() {
        return playerCards;
    }

    public void addCard(Card card){
        playerCards.add(card);
    }

    public void removeCard(Card card){
        playerCards.remove(card);
    }

    public int getSize(){
        return playerCards.size();
    }

    @Override
    public String toString() {
        return "" + name + ", size:" + getSize();
    }
}
