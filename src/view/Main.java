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

    	Button b0 = new Button("0");
        b0.setPrefWidth(50); 
        b0.setPrefHeight(50);  
        b0.setStyle("-fx-font-size: 16px");
        
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
        
        Button bvirg = new Button(",");
        bvirg.setPrefWidth(50); 
        bvirg.setPrefHeight(50);  
        bvirg.setStyle("-fx-font-size: 16px");
        
        Button bplus = new Button("+");
        bplus.setPrefWidth(80); 
        bplus.setPrefHeight(50);  
        bplus.setStyle("-fx-font-size: 16px");
        
        Button bmoins = new Button("-");
        bmoins.setPrefWidth(80); 
        bmoins.setPrefHeight(50);  
        bmoins.setStyle("-fx-font-size: 16px");
        
        Button bfois = new Button("*");
        bfois.setPrefWidth(80); 
        bfois.setPrefHeight(50);  
        bfois.setStyle("-fx-font-size: 16px");
        
        Button bdiviser = new Button("/");
        bdiviser.setPrefWidth(80); 
        bdiviser.setPrefHeight(50);  
        bdiviser.setStyle("-fx-font-size: 16px");
        
        Button benter = new Button("enter");
        benter.setPrefWidth(80); 
        benter.setPrefHeight(50);  
        benter.setStyle("-fx-background-color: red; "+"-fx-border-color: darkblue; " +"-fx-font-size: 16px");
        
     // Créer un GridPane
        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.BOTTOM_LEFT);
        gridpane.setStyle("-fx-background-color: lightblue;");
        gridpane.setVgap(2);
        gridpane.setHgap(2);

        // Ajouter des contraintes de colonnes pour créer de l'espace
        gridpane.getColumnConstraints().add(new ColumnConstraints(20)); // Colonne 0
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 1
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 2
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 3
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 4
        gridpane.getColumnConstraints().add(new ColumnConstraints(80)); // Colonne 5 

        // Positionner les boutons
        GridPane.setConstraints(b0, 2, 3); //Colonne 2 ligne 3
        GridPane.setConstraints(b1, 1, 0);
        GridPane.setConstraints(b2, 2, 0);
        GridPane.setConstraints(b3, 3, 0);
        GridPane.setConstraints(b4, 1, 1);
        GridPane.setConstraints(b5, 2, 1);
        GridPane.setConstraints(b6, 3, 1);
        GridPane.setConstraints(b7, 1, 2);
        GridPane.setConstraints(b8, 2, 2);
        GridPane.setConstraints(b9, 3, 2);
        GridPane.setConstraints(bvirg, 3, 3);
        GridPane.setConstraints(bplus, 5, 3); // Colonne 5, rangée 3
        GridPane.setConstraints(bmoins, 5, 2);
        GridPane.setConstraints(bfois, 5, 1);
        GridPane.setConstraints(bdiviser, 5, 0);
        GridPane.setConstraints(benter, 5,4);

        // Ajouter tous les éléments à la grille
        gridpane.getChildren().addAll(b0,b1, b2, b3, b4, b5, b6, b7, b8, b9, bvirg, bplus, bmoins, bfois, bdiviser, benter);

        
        // Créer la scène et afficher
        Scene scene = new Scene(gridpane, 320, 400); // x horizontal y vertical
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculatrice");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
