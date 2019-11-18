import java.util.List;

public interface Player {

    List<Card> getPlayerCards();

    void addCard(Card card);

    void removeCard(Card card);

    int getSize();

    void findPair();

}
