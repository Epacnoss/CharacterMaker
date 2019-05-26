package Classes.buy.armour;

public class container {

    public static boolean hasShield (Armour[] amors)
    {
        for(Armour a : amors)
        {
            if(a.isShield())
                return true;
        }

        return false;
    }

}
