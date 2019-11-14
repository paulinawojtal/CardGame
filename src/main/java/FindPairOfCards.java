public class FindPairOfCards {

    private int[] pair = new int[2];

    public int[] getPair() {
        return pair;
    }

    public int[] find(Player player){
        for(int i=0; i<player.getSize()-1; i++){
            for(int j=i+1; j<player.getSize(); j++){
                Card firstCard = player.getPlayerCards().get(i);
                Card secondCard = player.getPlayerCards().get(j);

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
