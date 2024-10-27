package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Créer une disposition (layout)
        StackPane root = new StackPane();

        // Créer un label avec le texte souhaité
        Label messageLabel = new Label("Je crois bien que ça fonctionne ! YOUHOU !");

        // Ajouter le label à la disposition
        root.getChildren().add(messageLabel);

        // Créer une scène avec la disposition et définir sa taille
        Scene scene = new Scene(root, 400, 300);

        // Définir le titre de la fenêtre
        primaryStage.setTitle("Fenêtre avec message");

        // Ajouter la scène à la fenêtre principale
        primaryStage.setScene(scene);

        // Afficher la fenêtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
