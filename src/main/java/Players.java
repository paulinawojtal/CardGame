import java.util.ArrayList;
import java.util.List;

public class Players {

    private List<Player> players;

    public Players(){
        players = new ArrayList<>();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void removePlayer(Player player){
        players.remove(player);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int getSize(){
        return players.size();
    }

    /*
    public void removeIfSize(){
        players.removeIf(p -> p.getSize() == 1);
    }

    public void removeIf(){
        players.removeIf(player -> )
    }

     */

    public void removeAll(List<Player> toRemove){
        players.removeAll(toRemove);
    }
}
