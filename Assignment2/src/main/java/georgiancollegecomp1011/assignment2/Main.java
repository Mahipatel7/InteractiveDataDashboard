package georgiancollegecomp1011.assignment2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(new File("src/main/resources/resources/search-view.fxml").toURI().toURL());
        Scene scene = new Scene(loader.load());
        stage.setTitle("Chemical Elements");
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/logo-image.jpg")));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
