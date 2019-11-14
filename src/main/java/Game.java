public class Game {

    public void playGame(){
        DeckOfCards deck = new DeckOfCards();
        // tworzenie talii
        deck.createDeck();
        System.out.println(deck.getSize());

        // wyświetlanie talii
        PrintDeckOfCards printDeck = new PrintDeckOfCards();
        printDeck.printDeck(deck);

        // tworzenie poszczególnych playerów
        Player janek = new Player("Janek");
        Player marian = new Player("Marian");
        Player franek = new Player("Franek");
        Player bolek = new Player("Bolek");
        Player muniek = new Player("Zygmunt");

        // dodanie playerów do listy playerów
        Players players = new Players();
        players.addPlayer(janek);
        players.addPlayer(marian);
        players.addPlayer(franek);
        players.addPlayer(bolek);
        //players.addPlayer(muniek);

        // rozdanie kart
        deck.shuffleDeck();
        System.out.println("=== Deck po Shuffle ===");
        printDeck.printDeck(deck);
        OneDeal oneDeal = new OneDeal();

        while(deck.getSize() != 0){
            oneDeal.makeDeal(deck, players);
        }
        System.out.println(deck.getSize());

        PrintPlayerCards printPlayerCards = new PrintPlayerCards();
        for(Player p : players.getPlayers()){
            printPlayerCards.printPlayerCards(p);
        }

        OneRoundOfGame oneRoundOfGame = new OneRoundOfGame();
        oneRoundOfGame.playOneRound(players);

        for(Player p : players.getPlayers()){
            printPlayerCards.printPlayerCards(p);
        }
        /*
        boolean nextRound;

        do{
            nextRound = oneRoundOfGame.playOneRound(players);
        }while(!nextRound);

        for(Player p : players.getPlayers()){
            printPlayerCards.printPlayerCards(p);
        }

         */
    }
}
