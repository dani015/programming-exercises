function solve() {
    class Balloon {
        constructor(color, gasWeight) {
            this.color = color;
            this.gasWeight = gasWeight;
        }
    }

    class PartyBalloon extends Balloon {
        constructor(color, gasWeight, ribbonColor, ribbonLength) {
            super(color, gasWeight);
            this.ribbonColor = ribbonColor;
            this.ribbonLength = ribbonLength;
        }

        get ribbon() {
            return {
                color: this.color,
                length: this.ribbonLength
            }
        }

    }

    class BirthdayBalloon extends PartyBalloon {
        constructor(color, gasWeight, ribbonColor, ribbonLength, text) {
            super(color, gasWeight, ribbonColor, ribbonLength);
            this.text = text;
        }

        get text() {
            return this.text;
        }
    }

    return {
        Balloon: Balloon,
        PartyBalloon: PartyBalloon,
        BirthdayBalloon: BirthdayBalloon
    }
}