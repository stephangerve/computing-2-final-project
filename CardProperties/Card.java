//Card.java
package CardProperties;
import GameProperties.*;
import java.util.*;


public abstract class Card{


	public Name cardName;
	public CardType cardType;
	public BankPoints cost;
	public BankPoints value;

	public Card(String cName, String cType){
		cardName = new Name(cName);
		cardType = new CardType(cType);
		cost = new BankPoints();
		value = new BankPoints();
	}
	public abstract void getSpecificCardInfo();
	public void getCardInfo(){
		//System.out.println();
		System.out.println("==================");
		System.out.println(cardName.getName());
		System.out.println("------------------");
		System.out.println(cardType.getCardType() + " Card");
		System.out.println("------------------");
		System.out.println("COST: ");
		cost.printBankPoints();
		System.out.println();
		System.out.println("------------------");
		System.out.println("VALUE: ");
		value.printBankPoints();
		System.out.println();
		getSpecificCardInfo();
			
	}



}
