import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

    private List<Card> deckOfCards;

    DeckOfCards() {
        deckOfCards = new ArrayList<>();
    }

    List<Card> getDeckOfCards() {
        return deckOfCards;
    }

    void createStandardDeck(int n){

        for(int i=1; i<=n; i++) {
            for (CardColor c : CardColor.values()) {
                for (CardFigure f : CardFigure.values()) {
                    if (c != CardColor.OWN) {
                        if (f != CardFigure.WITCH) {
                            Card card = new StandardCard(c, f);
                            deckOfCards.add(card);
                        }
                    }
                }
            }
        }

    }

    void addWitchCard(int n){
        for(int i=1; i<=n; i++){
            deckOfCards.add(new WitchCard());
        }
    }

    public int getSize(){
        return deckOfCards.size();
    }

    void removeCardFromDeck(Card card){
        deckOfCards.remove(card);
    }

    boolean deckIsEmpty(){
        return deckOfCards.isEmpty();
    }

}
