module KAKAculatrice_FX_VF {
	requires javafx.controls;
	exports view;
	
	opens application to javafx.graphics, javafx.fxml;
}
