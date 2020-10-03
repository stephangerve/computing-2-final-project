//CardDatabase.java
package Cards;
//import Cards.*;
import CardProperties.*;
import java.util.*;


public abstract class CardDatabase{

	Vector<Card> DB;
	public CardDatabase(){
		DB = new Vector<Card>();
		constructDatabase();
	}
	public void add(Card addCard){
		DB.add(addCard);
	}
	public Card get(int gC){
		return DB.get(gC);
	}
	public int count(){
		return DB.size();
	}
	public void printCardDatabase(){
		System.out.println("\tNo.\tName");
	    	System.out.println("\t---\t---------");
		for(int i = 0; i < DB.size(); i++){
			System.out.println("\t" + (i + 1) + ":\t" + DB.get(i).cardName.getName());
		}
	}
	public abstract void constructDatabase();


}
