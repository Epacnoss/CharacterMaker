package Classes.dice;

import java.util.Random;
import java.util.StringJoiner;

public class Dice {

    private int sides;
    private int number;
    private int modifier;

    public Dice(int sides, int number, int modifier) {
        this.sides = sides;
        this.number = number;
        this.modifier = modifier;
    }

    public Dice(int sides, int number) {
        this.sides = sides;
        this.number = number;

        modifier = 0;
    }

    public Dice(int sides) {
        this.sides = sides;

        number = 1;
        modifier = 0;
    }

    public int roll ()
    {
        Random rnd = new Random();

        int tot = modifier;

        for (int i = 0; i < number; i++) {
            tot += rnd.nextInt(sides);
        }

        return tot;
    }

    @Override
    public String toString() {
        String basic = sides + "d" + number;;

        if(modifier == 0)
        {
            return basic;
        }else
        {
            return basic + modifier;
        }
    }
}
