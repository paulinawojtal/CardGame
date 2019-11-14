import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

    private List<Card> deckOfCards;

    public DeckOfCards() {
        deckOfCards = new ArrayList<Card>();
    }

    public List<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public void createDeck(){
        for(CardColor c : CardColor.values()){
            for(CardFigure f : CardFigure.values()){
                if(c != CardColor.OWN){
                    if(f != CardFigure.WITCH){
                        Card card = new Card(c, f);
                        deckOfCards.add(card);
                    }
                }
            }
        }
        deckOfCards.add(new Card(CardColor.OWN, CardFigure.WITCH));
    }

    public int getSize(){
        return deckOfCards.size();
    }

    public void removeCardFromDeck(Card card){
        deckOfCards.remove(card);
    }

    public void shuffleDeck(){
        Collections.shuffle(deckOfCards);
    }

    public boolean deckIsEmpty(){
        return deckOfCards.isEmpty();
    }

}
