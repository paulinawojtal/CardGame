public class __RemovePairOfCards {

    public boolean removePair(HumanPlayer humanPlayer){
        __FindPairOfCards pair = new __FindPairOfCards();
        pair.find(humanPlayer);

        if(pair.getPair()[1] != 0){
            Card firstCard = humanPlayer.getPlayerCards().get(pair.getPair()[0]);
            Card secondCard = humanPlayer.getPlayerCards().get(pair.getPair()[1]);

            System.out.println(humanPlayer);
            System.out.println(firstCard);
            System.out.println(secondCard);

            humanPlayer.removeCard(secondCard);
            humanPlayer.removeCard(firstCard);
            return true;
        }
        return false;
    }

}
