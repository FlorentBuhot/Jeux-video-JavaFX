import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Test extends Application {
    /*
    public static void main(String[] args){


    }

     */

    @Override
    public void start(Stage primaryStage) throws Exception {
        //TEST
        Parent bd = FXMLLoader.load(getClass().getResource("/vue.fxml"));
        Scene scene1 = new Scene(bd);
        primaryStage.setScene(scene1);
        primaryStage.show();

        primaryStage.show();
    }
}
