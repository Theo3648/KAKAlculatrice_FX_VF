package view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
    	Button b1 = new Button("1");
        b1.setPrefWidth(50); 
        b1.setPrefHeight(50);  
        b1.setStyle("-fx-font-size: 16px");

        Button b2 = new Button("2");
        b2.setPrefWidth(50); 
        b2.setPrefHeight(50);  
        b2.setStyle("-fx-font-size: 16px");

        Button b3 = new Button("3");
        b3.setPrefWidth(50); 
        b3.setPrefHeight(50);  
        b3.setStyle("-fx-font-size: 16px");

        Button b4 = new Button("4");
        b4.setPrefWidth(50); 
        b4.setPrefHeight(50);  
        b4.setStyle("-fx-font-size: 16px");

        Button b5 = new Button("5");
        b5.setPrefWidth(50); 
        b5.setPrefHeight(50);  
        b5.setStyle("-fx-font-size: 16px");

        Button b6 = new Button("6");
        b6.setPrefWidth(50); 
        b6.setPrefHeight(50);  
        b6.setStyle("-fx-font-size: 16px");
        
        Button b7 = new Button("7");
        b7.setPrefWidth(50); 
        b7.setPrefHeight(50);  
        b7.setStyle("-fx-font-size: 16px");

        Button b8 = new Button("8");
        b8.setPrefWidth(50); 
        b8.setPrefHeight(50);  
        b8.setStyle("-fx-font-size: 16px");

        Button b9 = new Button("9");
        b9.setPrefWidth(50); 
        b9.setPrefHeight(50);  
        b9.setStyle("-fx-font-size: 16px");
        
        Button bplus = new Button("+");
        bplus.setPrefWidth(50); 
        bplus.setPrefHeight(50);  
        bplus.setStyle("-fx-font-size: 16px");
        
        Button bmoins = new Button("-");
        bplus.setPrefWidth(50); 
        bplus.setPrefHeight(50);  
        bplus.setStyle("-fx-font-size: 16px");
        
        Button bfois = new Button("*");
        bplus.setPrefWidth(50); 
        bplus.setPrefHeight(50);  
        bplus.setStyle("-fx-font-size: 16px");
        
        Button bdiviser = new Button("/");
        bplus.setPrefWidth(50); 
        bplus.setPrefHeight(50);  
        bplus.setStyle("-fx-font-size: 16px");
        
        Rectangle rectBlanc = new Rectangle(50, 40); // Esthetisme
        rectBlanc.setFill(Color.GRAY);
        
     // Créer un GridPane
        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.BOTTOM_LEFT);

        // Ajouter des contraintes de colonnes pour créer de l'espace
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 0
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 1
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 2
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 3
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 4
        gridpane.getColumnConstraints().add(new ColumnConstraints(100)); // Colonne 5 (plus large pour le bouton +)

        // Positionner les boutons
        GridPane.setConstraints(b1, 0, 0);
        GridPane.setConstraints(b2, 1, 0);
        GridPane.setConstraints(b3, 2, 0);
        GridPane.setConstraints(b4, 0, 1);
        GridPane.setConstraints(b5, 1, 1);
        GridPane.setConstraints(b6, 2, 1);
        GridPane.setConstraints(b7, 0, 2);
        GridPane.setConstraints(b8, 1, 2);
        GridPane.setConstraints(b9, 2, 2);
        GridPane.setConstraints(rectBlanc, 0, 3, 3, 1); // Unir les colonnes pour le rectangle
        GridPane.setConstraints(bplus, 5, 3); // Colonne 5, rangée 3

        // Ajouter tous les éléments à la grille
        gridpane.getChildren().addAll(b1, b2, b3, b4, b5, b6, b7, b8, b9, rectBlanc, bplus);

        //l'ancien code est sur le bloc note, celui bien mais chiffre collé au bord
        
        // Créer la scène et afficher
        Scene scene = new Scene(gridpane, 450, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculatrice");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
