package Classes.buy;

import Classes.buy.money.Money;

public abstract class Buyable {

    private double weight;
    private Money cost;
    private String name;

    public double getWeight() {
        return weight;
    }

    public Money getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public Buyable(double weight, Money cost, String name) {
        this.weight = weight;
        this.cost = cost;
        this.name = name;
    }
}
