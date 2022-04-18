package application;
import java.util.ArrayList;
import java.util.Collections;

/**
*CardModel is a java class that will set and get the card numbers into an arraylist
*
* @author Ryan Longoria*/
public class CardModel {
	ArrayList<Integer> cards;
	private int pos;
	
	/**
	 * CardModel is the constructor for an arraylist and adds cards
	 */
	public CardModel(){
		cards = new ArrayList<>();
		pos = 0;
		for(int i = 0 ; i <= 54 ; i++) {
			cards.add(i);
		}
	}
	
	/**
	 * shuffleCard will shuffle the cards
	 */
	public void shuffleCard(){
		Collections.shuffle(cards);
	}
	
	/**
	 * getCard is the getter for the cards
	 */
	public String getCard() {
		return cards.get(pos++) + ".png";
	}
	
	/**
	 * getPosition is the getter for pos
	 */
	public int getPosition()
	{
		return pos;
	}
	
	/**
	 * setPosition is the setter for Position
	 * @param Position takes in a random position
	 */
	public void setPosition(int Position)
	{
		pos = Position;
	}
} 
