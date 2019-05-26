package Classes.buy.money;

import java.util.StringJoiner;

public class Money {

    private moneyType type;
    private int cost;

    public Money(moneyType type, int cost) {
        this.type = type;
        this.cost = cost;
    }

    public moneyType getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }

    public int getCp ()
    {
        switch (type)
        {
            case cp:
                return cost;
            case sp:
                return cost * 10;
            case ep:
                return cost * 100;
            case gp:
                return cost * 1000;
            case pp:
                return cost * 1000;
        }

        return 0;
    }

    public static Money convert (Money from, moneyType to)
    {
        if(from.getType().equals(to))
            return from;


        int cp = from.getCp();

        int fp = 0;
        switch (to)
        {
            case cp:
                fp = cp;
                break;
            case sp:
                fp = cp / 10;
                break;
            case ep:
                fp = cp / 100;
                break;
            case gp:
                fp = cp / 1000;
                break;
            case pp:
                fp = cp / 10000;
        }

        return new Money(to, fp);
    }

    @Override
    public String toString() {
        return cost + "" + type;
    }
}
