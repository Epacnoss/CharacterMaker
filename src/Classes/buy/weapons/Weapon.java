package Classes.buy.weapons;

import Classes.buy.Buyable;
import Classes.buy.money.Money;

public class Weapon extends Buyable {

    private Damage damage;
    private String properties;

    public Weapon(int weight, Money cost, String name, Damage damage, String properties) {
        super(weight, cost, name);
        this.damage = damage;
        this.properties = properties;
    }

    public Damage getDamage() {
        return damage;
    }

    public String getProperties() {
        return properties;
    }
}
