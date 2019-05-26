package Classes.buy.weapons;

import Classes.dice.*;
import Classes.buy.money.*;

public class weaponTypes {

    //Pg 149

    public static Weapon Club ()
    {
        return new Weapon(2, new Money(moneyType.sp, 1), "Club", new Damage(new Dice(6), weaponType.bludgeoning), "Light");
    }
    public static Weapon Dagger ()
    {
        return new Weapon(1, new Money(moneyType.gp, 2), "Dagger", new Damage(new Dice(1, 4), weaponType.piercing), "Finesse, light, thrown, range 20/60)");
    }
    public static Weapon Greatclub ()
    {
        return new Weapon(10, new Money(moneyType.sp, 2), "Greatclub", new Damage(new Dice(1, 8), weaponType.bludgeoning), "Two-handed");
    }
    public static Weapon Handaxe ()
    {
        return new Weapon(2, new Money(moneyType.gp, 5), "Handaxe", new Damage(new Dice(6), weaponType.slashing), "Light, thrown (20/60)");
    }
    public static Weapon Javelin ()
    {
        return new Weapon(2, new Money(moneyType.sp, 5), "Javelin", new Damage(new Dice(6), weaponType.piercing), "Thrown (30/120)");
    }
    public static Weapon LightHammer ()
    {
        return new Weapon(4, new Money(moneyType.gp, 2), "Light Hammer", new Damage(new Dice(4), weaponType.bludgeoning), "Light, thrown(20/60)");
    }
    public static Weapon Mace ()
    {
        return new Weapon(4, new Money(moneyType.gp, 5), "Mace", new Damage(new Dice(6), weaponType.bludgeoning), "");
    }
    public static Weapon Quarterstaff ()
    {
        return new Weapon(4, new Money(moneyType.sp, 2), "Quarterstaff", new Damage(new Dice(6), weaponType.bludgeoning), "Versatile (1d8)");
    }
    public static Weapon Sickle ()
    {
        return new Weapon(2, new Money(moneyType.gp, 1), "Sickle", new Damage(new Dice(4), weaponType.piercing), "Light");
    }
    public static Weapon Spear ()
    {
        return new Weapon(3, new Money(moneyType.gp, 1), "Spear", new Damage(new Dice()))
    }
}
