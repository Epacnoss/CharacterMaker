package Classes.Abilities;

public class abilityMods {

    int str, dex, con, inte, wis, cha;

    public abilityMods(abilities abs) {

        str = get(abs.getStr());
        dex = get(abs.getDex());
        con = get(abs.getCon());
        inte = get(abs.getInte());
        wis = get(abs.getWis());
        cha = get(abs.getCha());

    }

    private int get (int ab){
        return ((int) Math.floor((ab - 10) / 2));
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
                return "Intelligence Modifier: ";
            case wis:
                return "Wisdom Modifier: ";
            case str:
                return "Strength Modifier: ";
            case dex:
                return "Dexterity Modifier: ";
            case con:
                return "Constitution Modifier: ";
            case cha:
                return "Charisma Modifier: ";
        }

        return "Something Modifier: ";
    }
}
