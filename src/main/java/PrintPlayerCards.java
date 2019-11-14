public class PrintPlayerCards {

    public void printPlayerCards(Player player){
        System.out.println();
        System.out.println(player);
        for(Card c : player.getPlayerCards()){
            System.out.printf("%s, ", c);
        }
        System.out.println();
    }
}
