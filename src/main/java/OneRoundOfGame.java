import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OneRoundOfGame {

    public boolean playOneRound(Players players){
        RemovePairOfCards remove = new RemovePairOfCards();

        List<Player> toRemove = new ArrayList<>();

        for(Player p : players.getPlayers()){
            boolean removeIsPossible = remove.removePair(p);

            if(removeIsPossible && p.getSize() == 0){
                System.out.printf("Mamy zwycięzce: %s!!!", p);
                return true;
            } else if (removeIsPossible && p.getSize() == 1){
                //players.removePlayer(p);
                toRemove.add(p);
            } else if(!removeIsPossible){
                //players.removePlayer(p);
                toRemove.add(p);
            }
        }
        players.removeAll(toRemove);
        return false;
    }

}
