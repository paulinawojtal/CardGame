public class Game {

    public void playGame(Players players){
        players.forEach(Player::findPair);
    }

    void play(){
        DeckOfCards deck = new DeckOfCards();
        deck.createStandardDeck(1);
        deck.addWitchCard(1);

        Printer print = new Printer();
        print.printDeck(deck);

        Player janek = new HumanPlayer("Janek");
        Player marian = new HumanPlayer("Marian");
        Player franek = new HumanPlayer("Franek");
        Player bolek = new HumanPlayer("Bolek");

        Players players = new Players();
        players.addPlayer(janek);
        players.addPlayer(marian);
        players.addPlayer(franek);
        players.addPlayer(bolek);

        CardDealer cardDealer = new CardDealer();
        cardDealer.shuffleDeck(deck);
        cardDealer.dealOfCards(players, deck);
        System.out.println(deck.getSize());

        print.printPlayer(janek);
        print.printPlayer(marian);
        print.printPlayer(franek);
        print.printPlayer(bolek);

        System.out.println();

        playGame(players);

    }
}
