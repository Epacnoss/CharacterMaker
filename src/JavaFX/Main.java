package JavaFX;

import Classes.Abilities.abilities;
import Classes.Personality;
import Classes.buy.armour.Armour;
import Classes.buy.armour.armourTypes;
import Classes.buy.weapons.Weapon;
import Classes.buy.weapons.weaponTypes;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    private Stage window;
    private Scene s;


    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("DnD Charcter Maker!");

        HBox top = InfoPane.showTop("Bob", "Paladin", 1, "Human","Evil-Chaotic", "Boi", 0);
        VBox abs = InfoPane.showAbilities(new abilities(15, 14, 13, 12, 10, 8));
        HBox armour = InfoPane.showArmour(new Armour[] {armourTypes.ChainMail(), armourTypes.Plate()});
        HBox weapons = InfoPane.showWeapons(new Weapon[]{weaponTypes.LightCrossbow(), weaponTypes.Quarterstaff()});
        GridPane bg = InfoPane.showBG(new Personality("Sexy and looooovs to have fun", "To sex every lord in the land", "No-one", "His tru love who died", "Strong, hulky.", "No-one", "Folk hero who looves to eat pie."));
        Separator leftNRight = new Separator();
        leftNRight.setOrientation(Orientation.VERTICAL);
        Separator left = new Separator();
        Separator right = new Separator();
        Separator right2 = new Separator();

        VBox leftVBOX = new VBox(20);
        leftVBOX.getChildren().addAll(top, abs);
        leftVBOX.getChildren().add(1, left);
        VBox rightVBOX = new VBox(20);
        rightVBOX.getChildren().addAll(armour, weapons, bg);
        rightVBOX.getChildren().add(1,right);
        rightVBOX.getChildren().add(3, right2);

        HBox fin = new HBox(30);
        fin.setPadding(new Insets(20));
        fin.getChildren().addAll(leftVBOX, rightVBOX);
        fin.getChildren().add(1, leftNRight);



        ScrollPane scp = new ScrollPane();
        scp.setContent(fin);

        s = new Scene(scp, 900, 600);

        window.setScene(s);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
