package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Sports_Center extends GGE_Center {

	public Sports_Center() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sports_Center(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@FXML
    private Button basketballb;

    @FXML
    private Button footballb;

    @FXML
    private Button volleyballb;

    @FXML
    void basketclick(ActionEvent event) {
    	Main.chosen.put(Main.sports[0].getName(), Main.sports[0].getPrice());
		Main.total+=Main.sports[0].getPrice();
    }

    @FXML
    void footclick(ActionEvent event) {
    	Main.chosen.put(Main.sports[2].getName(), Main.sports[2].getPrice());
		Main.total+=Main.sports[2].getPrice();
    }

    @FXML
    void volleyclick(ActionEvent event) {
    	 Main.chosen.put(Main.sports[1].getName(), Main.sports[1].getPrice());
			Main.total+=Main.sports[1].getPrice();
    }
}
