public enum CardColor {

    SPADE("\u2660"), HEART("\u2665"), DIAMOND("\u2666"), CLUB("\u2663"), OWN("\u2605");

    private  String s;

    CardColor(String s) {
        this.s = s;
    }

    public String getS(){
        return s;
    }
}
