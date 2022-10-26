package application;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class GGE_Center implements Initializable{

	@FXML
	private Label label;
	
	@FXML
	private BorderPane mainpane;
	
	@FXML
	private void handleSportsAction(ActionEvent event){
		System.out.println("you clicked sports");
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("Sports");
		mainpane.setCenter(view);
	}
	
	@FXML
	private void handleSkillAction(ActionEvent event){
		System.out.println("you clicked skill");
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("Skill");
		mainpane.setCenter(view);
	}

	@FXML
	private void handleAccAction(ActionEvent event){
		System.out.println("you clicked accommodation");
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("Sacc");
		mainpane.setCenter(view);
	}

	@FXML
	private void handleReceiptAction(ActionEvent event){
		System.out.println("you clicked Receipt");
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("Receipt");
		mainpane.setCenter(view);
	}

	@FXML
	private void bookR(ActionEvent event) {
		if (!Main.chosen.isEmpty()) {
			
//			System.out.println(Main.chosen+"\nYour total is D"+Main.total);
			try {
				receipt = new FileWriter("C:\\Users\\Daniel. O Achigbue\\eclipse-workspace\\another1\\src\\application\\receipt");
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
			     
				receipt.write("Thanks for using our services\nHere is your receipt\n");
				receipt.write("\n");
				Main.chosen.forEach((name, price)->{
					try {
						receipt.write(name+" = D"+price+"\n");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				});
				receipt.write("\nTotal price of all = D"+Main.total);
				receipt.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else {
			System.out.println("You have not selected anything");
			
		}
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	 static Scanner in = new Scanner(System.in);
	 private String name;
	 private int price;
	 static FileWriter receipt = null;
	 
	public GGE_Center(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public GGE_Center() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
