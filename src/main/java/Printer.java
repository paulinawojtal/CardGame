public class Printer {

    void printDeck(DeckOfCards deck){
        for(int i=0; i<deck.getSize(); i++){
            if(i % 6 == 0){
                System.out.println();
            }
            System.out.printf("%s, ", deck.getDeckOfCards().get(i));
        }
        System.out.println();
    }

    public void printPlayerCards(Player player){
        System.out.println();
        System.out.println(player.toString());
        player.getPlayerCards().forEach(card -> System.out.printf("%s, ", card));
        System.out.println();
    }

    void printCard(Card card){
        System.out.println(card.toString());
    }

    void printPlayer(Player player){
        System.out.println(player.toString());
    }
}
