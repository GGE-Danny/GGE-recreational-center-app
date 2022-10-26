package application;
	
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	static int total = 0;
	static HashMap<String, Integer> chosen = new HashMap<>();
	static File file = new File(
			"C:\\Users\\Daniel. O Achigbue\\eclipse-workspace\\another1\\src\\application\\input");
	static Scanner in;
	static ArrayList<Object> lines = new ArrayList<>();
	static String[] line1;
	static String[] line2;
	static String[] line3;
	static String[] line4;
	static String[] line5;
	static String[] line6;
	static Sports_Center[] sports =new Sports_Center[3];
	static Skill_School[] skills =new Skill_School[3] ;
	static Accomodation[] acc =new Accomodation[3];

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);
			Image icon = new Image("center.jpg");
			primaryStage .getIcons().add(icon);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {


		try {
			in = new Scanner(file);
			String line;

			while (in.hasNextLine()) {
				line = in.nextLine();

				lines.add(line);
			}

			line1 = (lines.get(0).toString().split(","));
			line2 = (lines.get(1).toString().split(","));
			line3 = (lines.get(2).toString().split(","));
			line4 = (lines.get(3).toString().split(","));
			line5 = (lines.get(4).toString().split(","));
			line6 = (lines.get(5).toString().split(","));

			for (int i = 0; i < line1.length; i++) {
				sports[i] = new Sports_Center(line1[i], Integer.parseInt(line2[i]));
				skills[i] = new Skill_School(line3[i], Integer.parseInt(line4[i]));
				acc[i] = new Accomodation(line5[i], Integer.parseInt(line6[i]));

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("The file You Inputed does not exist");
			System.exit(0);

		}
		System.out.println("\nWelcome to GGE recreational center");
		launch(args);
	}
}
