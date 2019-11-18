import java.util.Collections;
import java.util.List;

class CardDealer {

    /*
    public void creteDeck(int numberOfDecks, int numberOfWitchCard){
        deck = new DeckOfCards();
        deck.createStandardDeck(numberOfDecks);
        deck.addWitchCard(numberOfWitchCard);
    }
     */

    void shuffleDeck(DeckOfCards deck){
        Collections.shuffle(deck.getDeckOfCards());
    }

    void dealOfCards(Players players, DeckOfCards deck){

        while(deck.getSize() > 0) {
            players.forEach(player -> {
                if (!deck.deckIsEmpty()) {
                    Card card = deck.getDeckOfCards().get(0);
                    player.addCard(card);
                    deck.removeCardFromDeck(card);
                }
            });
        }
    }

}
