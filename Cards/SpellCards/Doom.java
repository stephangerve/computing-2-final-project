//Doom.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Doom extends Spell{

	public Doom(){
		super("Doom");
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(1);
		cost.setLightMana(0);
		cost.setAnyMana(2);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(1);
		value.setLightMana(0);
		value.setAnyMana(0);
		

		setSpellDesc("Destroy and enemy monster.");
	}
	public void activateSpell(Player your, Player opponent){
		System.out.println("\tChoose enemy monster to destroy.");
			System.out.println("\t----------");
			for (int i = 0; i < opponent.field.count(); i++){
				if (opponent.field.get(i).cardType.getCardType() == "Monster") {
					System.out.print("\t" + i + 1  + "." + opponent.field.get(i).cardName.getName());
					System.out.println();
				}
			}
			System.out.print(">> ");
			sm.makeChoice();
			System.out.print("\n\n->");
			System.out.println(opponent.field.get(sm.getChoice() - 1).cardName.getName() + " is destroyed.");
			try{
				opponent.discard(sm.getChoice() - 1, opponent.field);
			}
			catch(Message e){
				System.out.println(e);
				sm.sleep();
			}
			sm.sleep();
			sm.sleep();
	}





}
