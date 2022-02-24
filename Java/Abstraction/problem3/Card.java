package problem3;

public class Card {
    private Ranks cardRank;
    private Suits cardSuit;

    public Card(Ranks cardRank, Suits cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public int calculatePower(){

        int[] rankPowers = {14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] suitsPower = {0, 13, 26, 39};

        return rankPowers[this.cardRank.ordinal()] + suitsPower[this.cardSuit.ordinal()];
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.cardRank.toString(),
        this.cardSuit.toString(), this.calculatePower());
    }
}
