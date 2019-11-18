import java.util.ArrayList;
import java.util.List;

public class HumanPlayer implements Player{

    private String name;
    private List<Card> playerCards;

    HumanPlayer(String name){
        this.name = name;
        playerCards = new ArrayList<>();
    }


    @Override
    public List<Card> getPlayerCards() {
        return playerCards;
    }

    @Override
    public void addCard(Card card) {
        playerCards.add(card);
    }

    @Override
    public void removeCard(Card card) {
        if(playerCards.size() > 0){
            playerCards.remove(card);
        }
    }

    @Override
    public int getSize() {
        return playerCards.size();
    }

    private boolean removePair(){
        Printer printer = new Printer();

        for(int i=0; i<playerCards.size()-1; i++){
            for(int j=i+1; j<playerCards.size(); j++){
                Card firstCard = playerCards.get(i);
                Card secondCard = playerCards.get(j);

                if(firstCard.equals(secondCard)){
                    printer.printPlayer(this);
                    printer.printCard(firstCard);
                    printer.printCard(secondCard);

                    playerCards.remove(secondCard);
                    playerCards.remove(firstCard);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void findPair() {

        if(playerCards.size() > 1){
            removePair();
        }
    }

    @Override
    public String toString() {
        return "" + name + ": " + playerCards;
    }
}
