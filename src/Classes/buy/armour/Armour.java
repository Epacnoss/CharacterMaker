package Classes.buy.armour;

import Classes.buy.Buyable;
import Classes.buy.money.Money;
import Classes.stealth;

import java.util.StringJoiner;

public class Armour extends Buyable {

    private int ac;
    private int str;
    private stealth stealth;
    private boolean isShield;

    public Armour(String name, int weight, Money cost, int ac, int str, Classes.stealth stealth) {
        super(weight, cost, name);
        this.ac = ac;
        this.str = str;
        this.stealth = stealth;
        isShield = false;
    }

    public Armour(String name, int weight, Money cost, int ac, int str, Classes.stealth stealth, boolean isShield) {
        super(weight, cost, name);
        this.ac = ac;
        this.str = str;
        this.stealth = stealth;
        this.isShield = isShield;
    }

    public int getAc() {
        return ac;
    }

    public int getStr() {
        return str;
    }

    public Classes.stealth getStealth() {
        return stealth;
    }

    public boolean isShield() {
        return isShield;
    }
}
