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
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.event.ActionEvent;
import java.util.List;

import controler.CalculatorControler;

public class CalculatorGUI extends Application implements CalculatorGUIInterface{
	
	private CalculatorControler calccontr;
	private Label displayLabel1;
	private Label displayLabel2;
	private Label displayLabel3;
	private Label displayLabel4;
	private Label displayLabel5;
//	private Array

	public void affiche() {
		
		displayLabel1 = new Label("0");
        displayLabel1.setPrefHeight(50);
        displayLabel1.setMaxWidth(Double.MAX_VALUE);
        displayLabel1.setAlignment(Pos.TOP_RIGHT);
        displayLabel1.setStyle("-fx-font-size: 24px; -fx-background-color: lightblue; -fx-padding: 10px; -fx-border-color: black;");
        
        displayLabel2 = new Label("0");
        displayLabel2.setPrefHeight(50);
        displayLabel2.setMaxWidth(Double.MAX_VALUE);
        displayLabel2.setAlignment(Pos.TOP_RIGHT);
        displayLabel2.setStyle("-fx-font-size: 24px; -fx-background-color: lightblue; -fx-padding: 10px; -fx-border-color: black;");
        
        displayLabel3 = new Label("0");
        displayLabel3.setPrefHeight(50);
        displayLabel3.setMaxWidth(Double.MAX_VALUE);
        displayLabel3.setAlignment(Pos.TOP_RIGHT);
        displayLabel3.setStyle("-fx-font-size: 24px; -fx-background-color: lightblue; -fx-padding: 10px; -fx-border-color: black;");
        
        displayLabel4 = new Label("0");
        displayLabel4.setPrefHeight(50);
        displayLabel4.setMaxWidth(Double.MAX_VALUE);
        displayLabel4.setAlignment(Pos.TOP_RIGHT);
        displayLabel4.setStyle("-fx-font-size: 24px; -fx-background-color: lightblue; -fx-padding: 10px; -fx-border-color: black;");
        
        displayLabel5 = new Label("0");
        displayLabel5.setPrefHeight(50);
        displayLabel5.setMaxWidth(Double.MAX_VALUE);
        displayLabel5.setAlignment(Pos.TOP_RIGHT);
        displayLabel5.setStyle("-fx-font-size: 24px; -fx-background-color: lightblue; -fx-padding: 10px; -fx-border-color: black;");
		
		
		////
		
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

        Button benter = new Button("<>");
        benter.setPrefWidth(80); 
        benter.setPrefHeight(50);  
        benter.setStyle("-fx-background-color: lightgreen; -fx-border-color: darkblue; -fx-font-size: 16px");
        
        Button bops = new Button("+/-");
        bops.setPrefWidth(80); 
        bops.setPrefHeight(50);  
        bops.setStyle("-fx-font-size: 16px");
        
        Button bclear = new Button("C");
        bclear.setPrefWidth(50); 
        bclear.setPrefHeight(50);  
        bclear.setStyle("-fx-background-color: red;-fx-font-size: 16px");
        
        Button bclearall = new Button("CA");
        bclearall.setPrefWidth(50); 
        bclearall.setPrefHeight(50);  
        bclearall.setStyle("-fx-background-color: red;-fx-font-size: 16px");
        
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
        GridPane.setConstraints(bvirg, 1, 3);
        GridPane.setConstraints(bplus, 5, 3); // Colonne 5, rangée 3
        GridPane.setConstraints(bmoins, 5, 2);
        GridPane.setConstraints(bfois, 5, 1);
        GridPane.setConstraints(bdiviser, 5, 0);
        GridPane.setConstraints(benter, 5,4);
        GridPane.setConstraints(bops, 3, 3);
        GridPane.setConstraints(bclear, 1, 4);
        GridPane.setConstraints(bclearall, 3, 4);

        // Ajouter tous les éléments à la grille
        gridpane.getChildren().addAll(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bvirg, bops, bplus, bmoins, bfois, bdiviser, benter, bclear, bclearall);
        
     // Ajouter des événements pour les boutons de chiffres
//        b0.setOnAction(e -> updateDisplay("0"));
//        b1.setOnAction(e -> updateDisplay("1"));
//        b2.setOnAction(e -> updateDisplay("2"));
//        b3.setOnAction(e -> updateDisplay("3"));
//        b4.setOnAction(e -> updateDisplay("4"));
//        b5.setOnAction(e -> updateDisplay("5"));
//        b6.setOnAction(e -> updateDisplay("6"));
//        b7.setOnAction(e -> updateDisplay("7"));
//        b8.setOnAction(e -> updateDisplay("8"));
//        b9.setOnAction(e -> updateDisplay("9"));
//        bops.setOnAction(e -> updateDisplay("-"));
        
        //Concatener les deux
        VBox root = new VBox(displayLabel5, displayLabel4, displayLabel3, displayLabel2, displayLabel1, gridpane);
        
        // Créer la scène et afficher
        Scene scene = new Scene(root, 320, 540); // x horizontal y vertical
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
        bclear.addEventHandler(ActionEvent.ACTION, //Anant 
        		e -> {
        			calccontr.boutonClearPressé();
        		});
        bclearall.addEventHandler(ActionEvent.ACTION, //Anant 
        		e -> {
        			calccontr.boutonClearAllPressé();
        			
        		});
    }

	public void change(String accu) {
		System.out.println(accu);
        if(accu.equals("-")){
        	displayLabel1.setText(accu+displayLabel1.getText()); //Transforme en nombre negatif, je suis chaud de rajouter un truc dans  les events handlers
        }
        else {
            displayLabel1.setText(accu);
        }
		
	}
	//bizarre que tai acces à la pile alors quelle est en prive en plus tas le stackdata qui sert a rien du coup

	// si je spam click le plus par ex, du coup les resultats du haut ne se mette pas a jour
	public void change(List<Double> stackData) {
		System.out.println(stackData); //au debut la pile est vide, ou non remplie entierement
        int size = stackData.size(); //Me permet de connaitre son nombre d'elements
        if (size<4) {										//Pour le debut, quand la pile nest pas encore remplie
        	if (size==1) {
    			displayLabel2.setText(Double.toString(stackData.get(0)));
    		}
    		if (size==2) {
    			displayLabel2.setText(Double.toString(stackData.get(1)));
    			displayLabel3.setText(Double.toString(stackData.get(0)));
    		}
    		if (size==3) {
    			displayLabel2.setText(Double.toString(stackData.get(2)));
    			displayLabel3.setText(Double.toString(stackData.get(1)));
    			displayLabel4.setText(Double.toString(stackData.get(0)));
    		}
        }
        else {
        	displayLabel2.setText(Double.toString(stackData.get(size-1)));
    		displayLabel3.setText(Double.toString(stackData.get(size-2)));
    		displayLabel4.setText(Double.toString(stackData.get(size-3)));
    		displayLabel5.setText(Double.toString(stackData.get(size-4)));
        	}
        }
    
    public void start(Stage primaryStage) {
    	affiche();
    }
<<<<<<< HEAD

    public static void main(String[] args) {
        launch(args);
    }
}
=======
}
>>>>>>> refs/remotes/origin/master
