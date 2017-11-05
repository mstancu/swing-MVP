package fxml;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        URL resource = getClass().getResource("/fxml_view.fxml");
        Parent root = FXMLLoader.load(resource);

        stage.setTitle("FXML Welcome");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }
}
