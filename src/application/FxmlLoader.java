package application;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class FxmlLoader {
	private Pane view;

	public Pane getPage(String fileName) {
		try {
			URL fileUrl = Main.class.getResource("/application/" + fileName + ".fxml");
			if(fileUrl == null) {
				throw new java.io.FileNotFoundException("FXML file not found");
			}
			
			new FXMLLoader();
			view = FXMLLoader.load(fileUrl);
			
		} catch (Exception e) {
			System.out.println("No se encontro el archivo FXML " + fileName);
		}
		
		return view;
	}
}
