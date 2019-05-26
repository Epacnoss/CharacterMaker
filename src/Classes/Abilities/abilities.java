package Classes.Abilities;

public class abilities {

    private int str, dex, con, inte, wis, cha;

    public abilities(int str, int dex, int con, int inte, int wis, int cha) {
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.inte = inte;
        this.wis = wis;
        this.cha = cha;
    }

    public int getStr() {
        return str;
    }

    public int getDex() {
        return dex;
    }

    public int getCon() {
        return con;
    }

    public int getInte() {
        return inte;
    }

    public int getWis() {
        return wis;
    }

    public int getCha() {
        return cha;
    }

    public int get (abType a)
    {
        switch (a)
        {
            case cha:
                return cha;
            case con:
                return con;
            case dex:
                return dex;
            case str:
                return str;
            case wis:
                return wis;
            case inte:
                return inte;
        }

        return 0;
    }

    public static String getLabel (abType a)
    {
        switch (a)
        {
            case inte:
                return "Intelligence: ";
            case wis:
                return "Wisdom: ";
            case str:
                return "Strength: ";
            case dex:
                return "Dexterity: ";
            case con:
                return "Constitution: ";
            case cha:
                return "Charisma: ";
        }
        return "Something: ";
    }


}
