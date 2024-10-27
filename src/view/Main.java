package view;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Créer une disposition (layout)
        StackPane root = new StackPane();

        // Créer une scène avec la disposition et définir sa taille
        Scene scene = new Scene(root, 400, 300);

        // Définir le titre de la fenêtre
        primaryStage.setTitle("Fenêtre Vierge");

        // Ajouter la scène à la fenêtre principale
        primaryStage.setScene(scene);

        // Afficher la fenêtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
