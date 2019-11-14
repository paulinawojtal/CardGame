import java.util.Objects;

public class Card {

    private CardColor color;
    private CardFigure figure;

    public Card(CardColor color, CardFigure figure) {
        this.color = color;
        this.figure = figure;
    }

    public CardColor getColor() {
        return color;
    }

    public CardFigure getFigure() {
        return figure;
    }

    @Override
    public String toString() {
        return  "" + color.getS() + figure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return color == card.color ||
                figure == card.figure;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, figure);
    }
}
