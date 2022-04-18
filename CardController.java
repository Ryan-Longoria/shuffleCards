package application;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;

/**
*CardController is a java class that will connect to scenebuilder and shuffle the cards
*
* @author Ryan Longoria*/
public class CardController {
	CardModel model = new CardModel();
	@FXML
	Label title;
	
	@FXML
	ImageView image1;
	
	@FXML
	ImageView image2;
	
	@FXML
	ImageView image3;

	@FXML
	Button shuffle;
	
	@FXML 
	HBox hbox;
	/**
	 * buttonClick2 is for when the button is clicked on the GUI. WIll generate a random card
	 * @param event is for when the event triggers
	 */
	public void buttonClick2(ActionEvent event) {
		model.shuffleCard();
		try {
			
			InputStream in = getClass().getResourceAsStream("/Card/" + model.getCard());
			image1.setImage(new Image(in));
			
			in = getClass().getResourceAsStream("/Card/" + model.getCard());
			image2.setImage(new Image(in));
			
			in = getClass().getResourceAsStream("/Card/" + model.getCard());
			image3.setImage(new Image(in));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
