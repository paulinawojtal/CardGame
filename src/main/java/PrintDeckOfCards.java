public class PrintDeckOfCards {

    public void printDeck(DeckOfCards deck){
        for(int i=0; i<deck.getSize(); i++){
            if(i % 6 == 0){
                System.out.println();
            }
            System.out.printf("%s, ", deck.getDeckOfCards().get(i));
        }
        System.out.println();
    }
}
