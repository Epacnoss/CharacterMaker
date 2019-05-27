package Classes.buy.weapons;

import Classes.dice.Dice;

import java.util.StringJoiner;

public class Damage {

    private Dice howMuch;
    private weaponType whatType;

    public Damage(Dice howMuch, weaponType whatType) {
        this.howMuch = howMuch;
        this.whatType = whatType;
    }

    public Dice getHowMuch() {
        return howMuch;
    }

    public weaponType getWhatType() {
        return whatType;
    }

    @Override
    public String toString() {
        return howMuch.toString() + " " + whatType.toString();
    }
}
