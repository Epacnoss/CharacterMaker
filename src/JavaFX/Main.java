package JavaFX;

import Classes.Abilities.abilities;
import Classes.buy.armour.Armour;
import Classes.buy.armour.armourTypes;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
    Scene s;


    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("DnD Charcter Maker!");

        HBox top = InfoPane.showTop("Bob", "Paladin", 1, "Human","Evil-Chaotic", "Boi", 0);
        GridPane.setConstraints(top, 0, 0);
        VBox abs = InfoPane.showAbilities(new abilities(15, 14, 13, 12, 10, 8));
        GridPane.setConstraints(abs, 1, 0);
        HBox armour = InfoPane.showArmour(new Armour[] {armourTypes.ChainMail(), armourTypes.Plate()});
        GridPane.setConstraints(armour, 0, 2);

        GridPane fin = new GridPane();
        fin.setPadding(new Insets(20));
        fin.getChildren().addAll(top, abs, armour);



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
