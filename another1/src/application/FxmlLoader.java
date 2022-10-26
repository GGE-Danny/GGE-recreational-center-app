package application;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class FxmlLoader {
private Pane view;
	
	@SuppressWarnings("static-access")
	public Pane getPage(String fileName) {
		
		try {
			URL fileUrl = Main.class.getResource("/application/"+fileName+ ".fxml");
			//mainSkill.
			if(fileUrl == null) {
				throw new java.io.FileNotFoundException("File can't be found");
			}
			
			
			view = new FXMLLoader().load(fileUrl);
			
		}catch (Exception e) {
				System.out.println("No page " + fileName+ " please check fxmlloader");
			}
		return view;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
