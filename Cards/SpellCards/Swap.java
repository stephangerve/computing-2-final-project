//Swap.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Swap extends Spell{

	public Swap(){
		super("Swap");
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
		

		setSpellDesc("Switch any enemy monster on field with a monster in opponent's hand.");
	}
	public void activateSpell(Player your, Player opponent){
		System.out.println("\tChoose enemy monster on field to swap.");
		System.out.println("\t----------");
		for (int i = 0; i < opponent.field.count(); i++){
			if (opponent.field.get(i).cardType.getCardType() == "Monster") {
				System.out.print("\t" + i + 1  + "." + opponent.field.get(i).cardName.getName());
				System.out.println();
			}
		}
		System.out.print(">> ");
		sm.makeChoice();
		int a = sm.getChoice() - 1;
		String sa = opponent.field.get(a).cardName.getName();
		
		System.out.println("\tChoose enemy monster in opponent's hand to swap.");
		System.out.println("\t----------");
		for (int i = 0; i < opponent.hand.count(); i++){
			if (opponent.hand.get(i).cardType.getCardType() == "Monster") {
				System.out.print("\t" + i + 1  + "." + opponent.hand.get(i).cardName.getName());
				System.out.println();
			}
		}
		System.out.print(">> ");
		sm.makeChoice();
		int b = sm.getChoice() - 1;
		String sb = opponent.field.get(b).cardName.getName();
		
		opponent.field.addCard(opponent.hand.transferCard(a));
		opponent.hand.addCard(opponent.field.transferCard(b));
		System.out.print("\n\n->");
		System.out.println(sa + " has been switched with " + sb);
		sm.sleep();
		sm.sleep();
		sm.sleep();
	}





}
