package JavaFX;

import Classes.Abilities.abType;
import Classes.Abilities.abilities;
import Classes.Abilities.abilityMods;
import Classes.buy.armour.Armour;
import Classes.buy.armour.container;
import Classes.buy.weapons.Weapon;
import Classes.stealth;
import com.sun.org.apache.xpath.internal.operations.Gt;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

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
            Label abA = new Label(abMods.get(a) + "");
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
            Label minStrA = new Label(a.getStr() + "");
            GridPane.setConstraints(minStrA, 1, 4);

            Label stealthL = new Label("Stealth: ");
            GridPane.setConstraints(stealthL, 0, 5);
            Label steathA;
            if(a.getStealth() == stealth.none)
                steathA = new Label("N/A");
            else
                steathA = new Label(a.getStealth().toString());
            GridPane.setConstraints(steathA, 1, 5);

            temp.getChildren().addAll(name, weightL, weightA, costL, costA, acL, acA, minStrL, minStrA, stealthL, steathA);
            nas[i] = temp;
            i++;
        }

        HBox hb = new HBox(10);
        hb.getChildren().addAll(nas);
        return hb;
    }
//    public static HBox showWeapons (Weapon[] weapons)
    public static void showWeapons (Weapon[] weapons)
    {

    }

}
