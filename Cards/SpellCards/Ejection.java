//Ejection.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Ejection extends Spell{

	public Ejection(){
		super("Ejection");
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(0);
		cost.setLightMana(0);
		cost.setAnyMana(0);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(0);
		

		setSpellDesc("Send any card from opponent's hand to grave.");
	}
	public void activateSpell(Player your, Player opponent){
		System.out.println("\tChoose enemy monster from hand to send to grave.");
		System.out.println("\t----------");
		for (int i = 0; i < opponent.hand.count(); i++){
			if (opponent.hand.get(i).cardType.getCardType() == "Monster") {
				System.out.print("\t" + i + 1  + "." + opponent.hand.get(i).cardName.getName());
				System.out.println();
			}
		}
		System.out.print(">> ");
		sm.makeChoice();
		try{ 
			opponent.discard(sm.getChoice() - 1, opponent.hand);
		}
		catch(Message e){
			System.out.println(e);
			sm.sleep();
			sm.sleep();
			sm.sleep();
		}
	}





}
