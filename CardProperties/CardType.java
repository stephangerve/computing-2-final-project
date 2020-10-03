package CardProperties;
import java.util.*;



public class CardType{

	String cardType;
	public CardType(String cardType){
		setCardType(cardType);
	}
	public void setCardType(String cardType){
		if(checkCardType(cardType) == true){
			this.cardType = cardType;
		}
	}
	public String getCardType(){
		return cardType;
	}
	public boolean checkCardType(String cct){
		if(cct == "Monster"){
			return true;
		}
		else if(cct == "Spell"){
			return true;
		}
		else{
			return false;
		}
	}



}
