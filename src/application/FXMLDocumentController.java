package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
	
	@FXML
	Stage stage;
	
	@FXML
	private Button quitButton, minimizeButton, maximizeButton, dominioButton, mallaButton, tablaButton, modeloButton, mefButton, ensamblajeButton, contornoButton, inicioButton, siguienteButton, anteriorButton;
	
	@FXML
	private AnchorPane mainAnchorPane;
	
	@FXML
	private BorderPane contentPane, mefPane,  mefPane2, mefPane3, mefPane4, mefPane5, mefPane6, ensamblajePane, ensamblajePane2, inicioPane;
	
	@FXML
	private void quitButton(ActionEvent event) {
		stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
		stage.close();
	}
	
	@FXML
	private void minimizeButton(ActionEvent event) {
		stage = (Stage) mainAnchorPane.getScene().getWindow();
		//stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
		stage.setIconified(true);
	}
	
	
	@FXML
	private void maximizeButton(ActionEvent event) {
		stage = (Stage) mainAnchorPane.getScene().getWindow();
		if(stage.isMaximized()) {
			stage.setMaximized(false);
		} else {
			stage.setMaximized(true);
		}
	}
	
	@FXML
	private void handleMallaButton(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("Malla");
		contentPane.setCenter(view);
	}
	
	@FXML
	private void handleSiguienteButtonEnsamblaje(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("En2");
		ensamblajePane.setCenter(view);
	}
	
	@FXML
	private void handleAnteriorButtonEnsamblaje(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("En1");
		ensamblajePane2.setCenter(view);
	}
	
	@FXML
	private void handleEnsamblajeButton(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("En1");
		contentPane.setCenter(view);
	}
	
	@FXML
	private void handleDominioButton(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("Dominio");
		contentPane.setCenter(view);
	}
	
	@FXML
	private void handleTablaButton(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("Tabla");
		contentPane.setCenter(view);
	}
	
	@FXML
	private void handleModeloButton(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("Modelo");
		contentPane.setCenter(view);
	}
	
	@FXML
	private void handleSiguienteButton(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("MEF2");
		mefPane.setCenter(view);
	}
	
	@FXML
	private void handleSiguienteButton2(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("MEF3");
		mefPane2.setCenter(view);
	}
	
	@FXML
	private void handleSiguienteButton3(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("MEF4");
		mefPane3.setCenter(view);
	}
	
	@FXML
	private void handleSiguienteButton4(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("MEF5");
		mefPane4.setCenter(view);
	}
	
	@FXML
	private void handleSiguienteButton5(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("MEF6");
		mefPane5.setCenter(view);
	}
	
	@FXML
	private void handleSiguienteButton6(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("MEF7");
		mefPane6.setCenter(view);
	}
	
	@FXML
	private void handleMefButton(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("MEF");
		contentPane.setCenter(view);
	}
	
	
	@FXML
	private void handleAnteriorButton(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("MEF");
		mefPane2.setCenter(view);
	}
	
	@FXML
	private void handleAnteriorButton2(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("MEF2");
		mefPane3.setCenter(view);
	}
	
	@FXML
	private void handleAnteriorButton3(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("MEF3");
		mefPane4.setCenter(view);
	}
	
	@FXML
	private void handleAnteriorButton4(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("MEF4");
		mefPane5.setCenter(view);
	}
	
	@FXML
	private void handleAnteriorButton5(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("MEF5");
		mefPane6.setCenter(view);
	}
	
	
	@FXML
	private void handleInicioButton(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("Inicio");
		contentPane.setCenter(view);
	}
	
	@FXML
	private void handleContornoButton(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("Contorno");
		contentPane.setCenter(view);
	}
	
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}

}
