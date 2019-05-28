package Classes;

import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;

public class Personality {

    private String personalityTraits, ideals, bonds, flaws, appearance, allies, backstory;

    public Personality(String personalityTraits, String ideals, String bonds, String flaws, String appearance, String allies, String backstory) {
        this.personalityTraits = personalityTraits;
        this.ideals = ideals;
        this.bonds = bonds;
        this.flaws = flaws;
        this.appearance = appearance;
        this.allies = allies;
        this.backstory = backstory;
    }

    public String getPersonalityTraits() {
        return personalityTraits;
    }

    public String getIdeals() {
        return ideals;
    }

    public String getBonds() {
        return bonds;
    }

    public String getFlaws() {
        return flaws;
    }

    public String getAppearance() {
        return appearance;
    }

    public String getAllies() {
        return allies;
    }

    public String getBackstory() {
        return backstory;
    }


    public static ScrollPane getTxtArea(String txt) {
        TextArea txtArea = new TextArea(txt);
        txtArea.setEditable(false);
        txtArea.setPrefRowCount(3);
        txtArea.setPrefColumnCount(25);

        ScrollPane fin = new ScrollPane();
        fin.setContent(txtArea);
        fin.setFitToWidth(true);

        return fin;
    }
}
