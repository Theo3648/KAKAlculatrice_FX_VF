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
import javafx.event.ActionEvent;
import java.util.List;

import controler.CalculatorControler;

public class CalculatorGUI extends Application implements CalculatorGUIInterface{
	
	private CalculatorControler calccontr;

	public void affiche() {
		calccontr = new CalculatorControler(this);
		
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
        bplus.setPrefWidth(50); 
        bplus.setPrefHeight(50);  
        bplus.setStyle("-fx-font-size: 16px");
        
        Button bmoins = new Button("-");
        bmoins.setPrefWidth(50); 
        bmoins.setPrefHeight(50);  
        bmoins.setStyle("-fx-font-size: 16px");

        Button bfois = new Button("*");
        bfois.setPrefWidth(50); 
        bfois.setPrefHeight(50);  
        bfois.setStyle("-fx-font-size: 16px");

        Button bdiviser = new Button("/");
        bdiviser.setPrefWidth(50); 
        bdiviser.setPrefHeight(50);  
        bdiviser.setStyle("-fx-font-size: 16px");

        Button benter = new Button("<>");
        benter.setPrefWidth(50); 
        benter.setPrefHeight(50);  
        benter.setStyle("-fx-font-size: 16px");
        
        Button bops = new Button("+/-");
        bops.setPrefWidth(50); 
        bops.setPrefHeight(50);  
        bops.setStyle("-fx-font-size: 16px");
        
        Rectangle rectBlanc = new Rectangle(50, 40); // Esthetisme
        rectBlanc.setFill(Color.GRAY);
        
        // Créer un GridPane
        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.BOTTOM_LEFT);

        // Ajouter des contraintes de colonnes pour créer de l'espace
        gridpane.getColumnConstraints().add(new ColumnConstraints(20)); // Colonne 0
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 1
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 2
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 3
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 4
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 5 
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 6

        // Positionner les boutons
        GridPane.setConstraints(b0, 1, 3); //Colonne 1 ligne 3
        GridPane.setConstraints(b1, 1, 0);
        GridPane.setConstraints(b2, 2, 0);
        GridPane.setConstraints(b3, 3, 0);
        GridPane.setConstraints(b4, 1, 1);
        GridPane.setConstraints(b5, 2, 1);
        GridPane.setConstraints(b6, 3, 1);
        GridPane.setConstraints(b7, 1, 2);
        GridPane.setConstraints(b8, 2, 2);
        GridPane.setConstraints(b9, 3, 2);
        GridPane.setConstraints(bvirg, 2, 3);
        GridPane.setConstraints(bops, 3, 3);
        GridPane.setConstraints(bplus, 5, 3); // Colonne 5, rangée 3
        GridPane.setConstraints(bmoins, 5, 2);
        GridPane.setConstraints(bfois, 5, 1);
        GridPane.setConstraints(bdiviser, 5, 0);
        GridPane.setConstraints(benter, 6,0);

        // Ajouter tous les éléments à la grille
        gridpane.getChildren().addAll(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bvirg, bops, bplus, bmoins, bfois, bdiviser, benter);

        //l'ancien code est sur le bloc note, celui bien mais chiffre collé au bord
        
        // Créer la scène et afficher
        Scene scene = new Scene(gridpane, 320, 400); // x horizontal y vertical
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Calculatrice");
        stage.show();
        
       // La partie que le chef est en train de cook
        
        b0.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b0.getText());
        });
        
        b1.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		System.out.println(calccontr);
        		calccontr.boutonChiffreAppuye(b1.getText());
        });
        
        b2.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b2.getText());
        });
        
        b3.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b3.getText());
        });
        
        b4.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b4.getText());
        });
        
        b5.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b5.getText());
        });
        
        b6.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b6.getText());
        });
        
        b7.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b7.getText());
        });
        
        b8.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b8.getText());
        });
        
        b9.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b9.getText());
        });
        
        bvirg.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(".");
        });
        
        bmoins.addEventHandler(ActionEvent.ACTION,
        		e -> {
        			calccontr.boutonMoinsPressé();
        		});
        
        bplus.addEventHandler(ActionEvent.ACTION,
        		e -> {
        			calccontr.boutonPlusPressé();
        		}); 
        
        bfois.addEventHandler(ActionEvent.ACTION,
        		e -> {
        			calccontr.boutonFoisPressé();
        		});
        
        bdiviser.addEventHandler(ActionEvent.ACTION,
        		e -> {
        			calccontr.boutonDiviserPressé();
        		});
        
        benter.addEventHandler(ActionEvent.ACTION,
        		e -> {
        			calccontr.boutonEntréePressé();
        		});
       
    }

	public void change(String accu) {
		System.out.println(accu);
	}

	public void change(List<Double> stackData) {
		System.out.println(calccontr.getCalcMod().getPile());
	}
	
    public void start(Stage primaryStage) {
    	affiche();
    }
}
