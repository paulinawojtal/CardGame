import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Players implements Iterable<Player> {

    private List<Player> players;

    Players(){
        players = new ArrayList<>();
    }

    void addPlayer(Player Player){
        players.add(Player);
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

    @Override
    public Iterator<Player> iterator() {
        return this.players.iterator();
    }
}
