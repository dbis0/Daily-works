import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class myExercises extends Application {
	
	// initialize counters
	private int counterHTB = 1;
	private int counterPentesterLab = 10;
	private int counterELS = 1;
	
	// initialize labels
	private Label labelHTB = new Label("Hackthebox machines remaining: "+counterHTB);
	private Label labelPentesterLab = new Label("PentesterLab remaining exercises: "+counterPentesterLab);
	private Label labelELS = new Label("eLearnSecurity XDS course: "+counterELS);
	private Label Finish = new Label();

public static void main (String [] args){
    Application.launch();
}


public void start(Stage primaryStage) throws Exception {
	// initialize stage && settings
    Stage stage = new Stage();
    stage = primaryStage;
    stage.getIcons().add(new Image(("file:///E:/Data/Documents/JAVA_workspace/exercises/src/icon.png"))); // Edit the image path according to your device
       
    // initialize VBOX && settings
    VBox root = new VBox();
    root.setSpacing(5);
    root.setAlignment(Pos.CENTER);
    
    // initialize Buttons
    Button buttonHTB = new Button("ROOOOT one Machine!");
    Button buttonPentesterLab = new Button("One Exercise Done !");
    Button buttonELS = new Button("enough studing !");
    
    // Add image for hackthebox
    Image HTB_img = new Image("file:///E:/Data/Documents/JAVA_workspace/exercises/src/hackthebox.png"); // Edit the image path according to your device
    ImageView HTB_imgView = new ImageView(HTB_img);
    HTB_imgView.setFitHeight(100);
    HTB_imgView.setFitWidth(300);
    
    // Adding HTB image & button & label to VBOX
    root.getChildren().add(HTB_imgView);
    root.getChildren().add(labelHTB);
    root.getChildren().add(buttonHTB);
    
    // Add image for PentesterLab
    Image PentesterLab_img = new Image("file:///E:/Data/Documents/JAVA_workspace/exercises/src/pentesterlab.png"); // Edit the image path according to your device
    ImageView PentesterLab_imgView = new ImageView(PentesterLab_img);
    PentesterLab_imgView.setFitHeight(100);
    PentesterLab_imgView.setFitWidth(300);
    
    // Adding PentesterLab image & button & label to VBOX
    root.getChildren().add(PentesterLab_imgView);
    root.getChildren().add(labelPentesterLab);
    root.getChildren().add(buttonPentesterLab);

    // Add image for XDS course
    Image XDS_img = new Image("file:///E:/Data/Documents/JAVA_workspace/exercises/src/XDS.png"); // Edit the image path according to your device
    ImageView XDS_imgView = new ImageView(XDS_img);
    XDS_imgView.setFitHeight(100);
    XDS_imgView.setFitWidth(300);
    
    // Adding XDS image & button & label to VBOX
    root.getChildren().add(XDS_imgView);
    root.getChildren().add(labelELS);
    root.getChildren().add(buttonELS);
    
    // Adding the button label for results
    root.getChildren().add(Finish);
    
    // Add the root (VBOX) to Scene
    Scene scene1 = new Scene(root,400, 600);
    
    // Adding the Scene to stage
    stage.setScene(scene1);
    stage.setTitle("My daily works!");
    stage.show();
    

    // button HTB action
    buttonHTB.setOnAction(e -> {
    	if(counterHTB > 0) {
    		counterHTB--;
    		if(counterHTB == 0) {
    			Finish.setText("You Done with Hackthebox !!");
    			labelHTB.setDisable(true);
    		}else {
    			Finish.setText("");
    		}
    		labelHTB.setText("Hackthebox machines remaining: "+counterHTB);
    	}
    		
    	if(counterHTB <= 0) {
    		if(counterHTB <= 0 && counterPentesterLab <= 0 && counterELS <= 0) {
    			Finish.setText("You Did Great ... take a rest <3!");
    			Finish.setDisable(true);
    		}
    	}
    });
    
    // button PentesterLab action
    buttonPentesterLab.setOnAction(e -> {
    	if(counterPentesterLab > 0) {
    		counterPentesterLab--;
    		if(counterPentesterLab == 0) {
    			Finish.setText("You Done with PentesterLab !!");
    			labelPentesterLab.setDisable(true);
    		}else {
    			Finish.setText("");
    		}
			labelPentesterLab.setText("PentesterLab remaining exercises: "+counterPentesterLab);
    	}
    		
    	if(counterPentesterLab <= 0) {
    		if(counterHTB <= 0 && counterPentesterLab <= 0 && counterELS <= 0) {
    			Finish.setText("You Did Great ... take a rest <3!");
    			Finish.setDisable(true);
    		}
    	}
    });
    
    // button XDS action
    buttonELS.setOnAction(e -> {
    	if(counterELS > 0) {
    		counterELS--;
    		if(counterELS == 0) {
    			Finish.setText("You Done with eLearnSecurity !!");
    			labelELS.setDisable(true);
    		}else {
    			Finish.setText("");
    		}
    		labelELS.setText("eLearnSecurity XDS course: "+counterELS);
    	}
    		
    	if(counterELS <= 0) {
    		if(counterHTB <= 0 && counterPentesterLab <= 0 && counterELS <= 0) {
    			Finish.setText("You Did Great ... take a rest <3!");
    			Finish.setDisable(true);
    		}
    	}
    });
}
}