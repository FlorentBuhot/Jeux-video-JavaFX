import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class vue {
    @FXML
    private Button bouton;

    @FXML
    public void changerTexte(ActionEvent actionEvent) {
        bouton.setText("JE M AFFICHE ENCORE");
        /*
        bouton.setScaleX(50);
        bouton.setScaleY(100);

         */
        /*
        bouton.setLayoutX(0);
        bouton.setLayoutY(0);

         */
        bouton.setTranslateX(70);
        bouton.setTranslateY(70);
    }
}