package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Receipt {
	
	public Receipt() {
		super();
		// TODO Auto-generated constructor stub
	}

    @FXML
    private Label pReceipt;
	
	public Label getpReceipt() {
		return pReceipt;
	}

	public void setpReceipt(Label pReceipt) {
		this.pReceipt = pReceipt;
	}

	
	public void initialize() {
		String list="\n";
	
		if (Main.chosen.isEmpty() == false) {
			
			for(int i=0;i<Main.chosen.size();i++) {
				list+=Main.chosen.get(i)+"\n";
			}
			pReceipt.setText("You have selected the following services" + "\n"+ Main.chosen
					+ "\nYour total is: D" + Main.total);
			
			System.out.println("You have selected the following services" + " " + Main.chosen
					+ "\nYour total is: D" + Main.total);
		} 
		else {
			pReceipt.setText("You have not selected any service");
			System.out.println("You have not selected any service");

		}
	 }
}
