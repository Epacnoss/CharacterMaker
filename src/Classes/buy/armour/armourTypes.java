package Classes.buy.armour;

import Classes.buy.money.Money;
import Classes.buy.money.moneyType;
import Classes.stealth;

public class armourTypes {

    //Pg 143

    public static Armour Padded (int dexMod)
    {
        return new Armour("Padded",8, new Money(moneyType.gp, 5), 11 + dexMod, 0, stealth.disadvantage);
    }
    public static Armour Leather (int dexMod)
    {
        return new Armour("Leather",10, new Money(moneyType.gp, 10), 11 + dexMod, 0, stealth.none);
    }
    public static Armour StuddedLeather (int dexMod)
    {
        return new Armour("Studded Leather",13, new Money(moneyType.gp, 45), 12 + dexMod, 0, stealth.none);
    }

    public static Armour Hide (int dexMod0)
    {
        int dexMod = dexMod0;
        if(dexMod > 2)
            dexMod = 2;

        return new Armour("Hide",12, new Money(moneyType.gp, 10), 12 + dexMod, 0, stealth.none);
    }
    public static Armour ChainShirt (int dexMod0)
    {
        int dexMod = dexMod0;
        if(dexMod > 2)
            dexMod = 2;

        return new Armour("Chain Shirt",20, new Money(moneyType.gp, 50), 13 + dexMod, 0, stealth.none);
    }
    public static Armour ScaleMail (int dexMod0)
    {
        int dexMod = dexMod0;
        if(dexMod > 2)
            dexMod = 2;

        return new Armour("Scale Mail",45, new Money(moneyType.gp, 50), 14 + dexMod, 0, stealth.disadvantage);
    }
    public static Armour BreastPlate (int dexMod0)
    {
        int dexMod = dexMod0;
        if(dexMod > 2)
            dexMod = 2;

        return new Armour("Breast Plate",20, new Money(moneyType.gp, 400), 14 + dexMod, 0, stealth.none);
    }
    public static Armour HalfPlate (int dexMod0)
    {
        int dexMod = dexMod0;
        if(dexMod > 2)
            dexMod = 2;

        return new Armour("Half Plate",40, new Money(moneyType.gp, 750), 15 + dexMod, 0, stealth.none);
    }

    public static Armour RingMail ()
    {
        return new Armour("Ring Mail",40, new Money(moneyType.gp, 30), 14, 0, stealth.disadvantage);
    }
    public static Armour ChainMail ()
    {
        return new Armour("Chain Mail",55, new Money(moneyType.gp, 75), 16, 13, stealth.disadvantage);
    }
    public static Armour Splint ()
    {
        return new Armour("Splint",60, new Money(moneyType.gp, 200), 17, 15, stealth.disadvantage);
    }
    public static Armour Plate ()
    {
        return new Armour("Plate",65, new Money(moneyType.gp, 1500), 18, 15, stealth.disadvantage);
    }

    public static Armour Shield ()
    {
        return new Armour("Shield",6, new Money(moneyType.gp, 10), 2, 0, stealth.none, true);
    }
}
