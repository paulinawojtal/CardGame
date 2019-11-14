import java.util.Collections;

public class OneDeal {

    public void makeDeal(DeckOfCards deck, Players players){

        for(int i=0; i<players.getSize(); i++){

            if(!deck.deckIsEmpty()){
                Player player = players.getPlayers().get(i);
                Card card = deck.getDeckOfCards().get(0);

                player.addCard(card);
                deck.removeCardFromDeck(card);
            }
        }
    }
}
