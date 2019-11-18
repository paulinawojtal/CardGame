public class __FindPairOfCards {

    private int[] pair = new int[2];

    public int[] getPair() {
        return pair;
    }

    public int[] find(HumanPlayer humanPlayer){
        for(int i = 0; i< humanPlayer.getSize()-1; i++){
            for(int j = i+1; j< humanPlayer.getSize(); j++){
                Card firstCard = humanPlayer.getPlayerCards().get(i);
                Card secondCard = humanPlayer.getPlayerCards().get(j);

                if(firstCard.equals(secondCard)){
                    pair[0] = i;
                    pair[1] = j;
                    return pair;
                }
            }
        }
        return pair;
    }
}
