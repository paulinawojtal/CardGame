public class RemovePairOfCards {

    public boolean removePair(Player player){
        FindPairOfCards pair = new FindPairOfCards();
        pair.find(player);

        if(pair.getPair()[1] != 0){
            Card firstCard = player.getPlayerCards().get(pair.getPair()[0]);
            Card secondCard = player.getPlayerCards().get(pair.getPair()[1]);

            System.out.println(player);
            System.out.println(firstCard);
            System.out.println(secondCard);

            player.removeCard(secondCard);
            player.removeCard(firstCard);
            return true;
        }
        return false;
    }

}
