package proge;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Main extends Application {

    @Override
    public void start(Stage lava) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        lava.setTitle("Ostukorv");
        lava.setScene(new Scene(root));
        lava.show();
    }

    public static void main(String[] args) throws FileNotFoundException {
        launch(args);
    }
}
