package JavaFX;

import Classes.Abilities.abType;
import Classes.Abilities.abilities;
import Classes.Abilities.abilityMods;
import Classes.Personality;
import Classes.buy.armour.Armour;
import Classes.buy.weapons.Weapon;
import Classes.stealth;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class InfoPane {

    public static HBox showTop (String name, String classType, int level, String race, String Align, String IRLName, int xp)
    {
        VBox left = new VBox(10);

        Label nameL = new Label("Name: ");
        Label classL = new Label("Class: ");
        Label levelL = new Label("Level: ");
        Label raceL = new Label("Race: ");
        Label alignL = new Label("Alignment: ");
        Label IRLL = new Label("Real Name: ");
        Label xpL = new Label("Experience: ");
        left.getChildren().addAll(nameL, classL, levelL, raceL, alignL, IRLL, xpL);


        VBox right = new VBox(10);

        Label nameA = new Label(name);
        Label classA = new Label(classType);
        Label levelA = new Label(level + "");
        Label raceA = new Label(race);
        Label alignA = new Label(Align);
        Label IRLA = new Label(IRLName);
        Label xpA = new Label(xp + "xp");
        right.getChildren().addAll(nameA, classA, levelA, raceA, alignA, IRLA, xpA);



        HBox fin = new HBox(10);
        fin.getChildren().addAll(left, right);

        return fin;
    }
    public static VBox showAbilities (abilities abs)
    {
        abilityMods abMods = new abilityMods(abs);

        Node[] nas = new Node[6];
        int i = 0;
        for(abType a : abType.values())
        {
            GridPane temp = new GridPane();

            Label aL = new Label(abilities.getLabel(a));
            GridPane.setConstraints(aL, 0, 0);
            Label abL = new Label(abilityMods.getLabel(a));
            GridPane.setConstraints(abL, 0, 1);

            Label aA = new Label(abs.get(a) + "");
            GridPane.setConstraints(aA, 1, 0);

            int abMod = abMods.get(a);
            String abMo = "";
            if (abMod > 0) {
                abMo = "+" + abMod;
            } else {
                abMo = abMod + "";
            }


            Label abA = new Label(abMo);
            GridPane.setConstraints(abA, 1, 1);

            temp.getChildren().addAll(aL, abL, aA, abA);
            nas[i] = temp;



            i++;
        }

        VBox fin = new VBox(10);
        fin.getChildren().addAll(nas);

        return fin;
    }


    public static HBox showArmour (Armour[] armour)
    {
        Node[] nas = new Node[armour.length];

        int i = 0;
        for(Armour a : armour)
        {
            GridPane temp = new GridPane();

            Label name = new Label(a.getName());
            GridPane.setConstraints(name, 0, 0, 2, 1);

            Label weightL = new Label("Weight: ");
            GridPane.setConstraints(weightL, 0, 1);
            Label weightA = new Label(a.getWeight() + "lbs");
            GridPane.setConstraints(weightA, 1, 1);

            Label costL = new Label("Cost: ");
            GridPane.setConstraints(costL, 0, 2);
            Label costA = new Label(a.getCost().toString());
            GridPane.setConstraints(costA, 1, 2);

            Label acL = new Label("Armour class: ");
            GridPane.setConstraints(acL, 0, 3);
            Label acA;
            if(a.isShield())
                acA = new Label("+2");
            else
                acA = new Label(a.getAc() + "");
            GridPane.setConstraints(acA, 1, 3);

            Label minStrL = new Label("Minimum strength: ");
            GridPane.setConstraints(minStrL, 0, 4);
            Label minStrA = new Label("Str" + a.getStr());
            GridPane.setConstraints(minStrA, 1, 4);

            Label stealthL = new Label("Stealth: ");
            GridPane.setConstraints(stealthL, 0, 5);
            Label steathA;
            if(a.getStealth() == stealth.none)
                steathA = new Label("N/A");
            else
                steathA = new Label("" + a.getStealth());
            GridPane.setConstraints(steathA, 1, 5);

            temp.getChildren().addAll(name, weightL, weightA, costL, costA, acL, acA, minStrL, minStrA, stealthL, steathA);
            nas[i] = temp;
            i++;
        }

        HBox hb = new HBox(10);
        hb.getChildren().addAll(nas);
        return hb;
    }
    public static HBox showWeapons (Weapon[] weapons)
    {
        Node[] nas = new Node[weapons.length];

        int  i = 0;
        for(Weapon w : weapons)
        {
            GridPane temp = new GridPane();

            Label name = new Label(w.getName());
            GridPane.setConstraints(name, 0, 0, 2, 1);

            Label weightL = new Label("Weight: ");
            GridPane.setConstraints(weightL, 0, 1);
            Label weightA = new Label(w.getWeight() + "lbs");
            GridPane.setConstraints(weightA, 1, 1);

            Label costL = new Label("Cost: ");
            GridPane.setConstraints(costL, 0, 2);
            Label costA = new Label(w.getCost().toString());
            GridPane.setConstraints(costA, 1, 2);

            Label damageL = new Label("Damage: ");
            GridPane.setConstraints(damageL, 0, 3);
            Label damageA = new Label(w.getDamage().toString());
            GridPane.setConstraints(damageA, 1, 3);

            Label propsL = new Label("Properties: ");
            GridPane.setConstraints(propsL, 0, 4);
            Label propsA = new Label(w.getProperties());
            GridPane.setConstraints(propsA, 1, 4, 2, 1);

            temp.getChildren().addAll(name, weightL, weightA, costL, costA, damageL, damageA, propsL, propsA);
            nas[i] = temp;
            i++;
        }

        HBox fin = new HBox(10);
        fin.getChildren().addAll(nas);
        return fin;
    }

    public static GridPane showBG(Personality p) {
        GridPane fin = new GridPane();

        Label traitsL = new Label("Personality Traits: ");
        GridPane.setConstraints(traitsL, 0, 0);
        ScrollPane traitsA = Personality.getTxtArea(p.getPersonalityTraits());
        GridPane.setConstraints(traitsA, 1, 0, 1, 2);

        Label idealsL = new Label("Ideals: ");
        GridPane.setConstraints(idealsL, 0, 2);
        ScrollPane idealA = Personality.getTxtArea(p.getIdeals());
        GridPane.setConstraints(idealA, 1, 2, 1, 2);

        Label bondsL = new Label("Bonds: ");
        GridPane.setConstraints(bondsL, 0, 4);
        ScrollPane bondsA = Personality.getTxtArea(p.getBonds());
        GridPane.setConstraints(bondsA, 1, 4, 1, 2);

        Label flawsL = new Label("Flaws: ");
        GridPane.setConstraints(flawsL, 0, 6);
        ScrollPane flawsA = Personality.getTxtArea(p.getFlaws());
        GridPane.setConstraints(flawsA, 1, 6, 1, 2);

        Label appearL = new Label("Apperance: ");
        GridPane.setConstraints(appearL, 0, 8);
        ScrollPane appearA = Personality.getTxtArea(p.getAppearance());
        GridPane.setConstraints(appearA, 1, 8, 1, 2);

        Label alliesL = new Label("Allies: ");
        GridPane.setConstraints(alliesL, 0, 10);
        ScrollPane alliesa = Personality.getTxtArea(p.getAllies());
        GridPane.setConstraints(alliesa, 1, 10, 1, 2);

        Label bgL = new Label("Backstory: ");
        GridPane.setConstraints(bgL, 0, 12);
        ScrollPane bgA = Personality.getTxtArea(p.getBackstory());
        GridPane.setConstraints(bgA, 1, 12, 1, 2);


        fin.getChildren().addAll(traitsL, traitsA, idealsL, idealA, bondsL, bondsA, flawsL, flawsA, appearL, appearA, alliesL, alliesa, bgL, bgA);

        return fin;

    }

}
