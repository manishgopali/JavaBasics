package assing6.Q5;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RegistrationFormUsingJavaFXUIControls  extends Application{
    
	Label lblName, lblMobile, lblGender,lblLanguage;
	TextField txtName;
	PasswordField txtMobile;
	RadioButton rdMale,rdFemale;
	CheckBox chkNepali, chkEnglish;
	Button btnSubmit;
	
	public void start(Stage primaryStage) throws Exception {

		
		primaryStage.setTitle("Registration Form");
		
		VBox vBox = new VBox(10);
		
		lblName = new Label("Username :");
		txtName = new TextField();
	
		
		lblMobile = new Label("Password :");
        txtMobile = new PasswordField();
		
		
		lblGender = new Label("Gender :");
		HBox genderBox = new HBox(20);
		
		ToggleGroup grp = new ToggleGroup();
		rdMale = new RadioButton("Male");
		rdMale.setToggleGroup(grp);
		rdFemale = new RadioButton("Female");
		rdFemale.setToggleGroup(grp);

	
		genderBox.getChildren().addAll(rdMale,rdFemale);
		
		lblLanguage = new Label("Languages :");
		HBox languageBox = new HBox(20);
		chkEnglish = new CheckBox("English");
		chkNepali = new CheckBox("Nepali");
		languageBox.getChildren().addAll(chkNepali,chkEnglish);
		
		btnSubmit = new Button("Submit");
		
		vBox.getChildren().addAll(lblName,txtName,lblMobile,txtMobile,lblGender, genderBox,lblLanguage, languageBox,btnSubmit);
		
		
		
		
		
		
		
		
		Scene scene = new Scene(vBox,400,300);
		primaryStage.setScene(scene);
		
		primaryStage.show();

		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	

}
