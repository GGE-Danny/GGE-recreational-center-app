package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Skill_School extends GGE_Center {
	public Skill_School(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	
	public Skill_School() {
		super();
		// TODO Auto-generated constructor stub
	}
	@FXML
    private Button cookingb;

    @FXML
    private Button programmingb;

    @FXML
    private Button sewingb;

    @FXML
    void cookingclick(ActionEvent event) {
    	Main.chosen.put(Main.skills[1].getName(), Main.skills[1].getPrice());
		Main.total+=Main.skills[1].getPrice();
    }

    @FXML
    void programmingclick(ActionEvent event) {
    	Main.chosen.put(Main.skills[0].getName(), Main.skills[0].getPrice());
		Main.total+=Main.skills[0].getPrice();
    }

    @FXML
    void sewingclick(ActionEvent event) {
    	Main.chosen.put(Main.skills[2].getName(), Main.skills[2].getPrice());
		Main.total+=Main.skills[2].getPrice();
    }

}
