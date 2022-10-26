package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Accomodation extends GGE_Center{
	public Accomodation(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	
	public Accomodation() {
		super();
		// TODO Auto-generated constructor stub
	}

	 @FXML
	    private Button cabinb;

	    @FXML
	    private Button hotelb;

	    @FXML
	    private Button motelb;

	    @FXML
	    void cabinclick(ActionEvent event) {
	    	Main.chosen.put(Main.acc[2].getName(), Main.acc[2].getPrice());
			Main.total+=Main.acc[2].getPrice();
	    }

	    @FXML
	    void hotelclick(ActionEvent event) {
	    	Main.chosen.put(Main.acc[0].getName(), Main.acc[0].getPrice());
			Main.total+=Main.acc[0].getPrice();
	    }

	    @FXML
	    void motelclick(ActionEvent event) {
	    	Main.chosen.put(Main.acc[1].getName(), Main.acc[1].getPrice());
			Main.total+=Main.acc[1].getPrice();
	    }


}
