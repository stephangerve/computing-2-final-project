//Earthquake.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Earthquake extends Spell{

	public Earthquake(){
		super("Earthquake");
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
		value.setEarthMana(1);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(0);
		

		setSpellDesc("Deal 2 damage to every monster on field except earth element type monsters.");
	}
	public void activateSpell(Player your, Player opponent){
		for(int i = 0; i < your.field.count(); i++){
			if(your.field.get(i).cardType.getCardType() == "Monster"){
				if(((Monster) your.field.get(i)).elementType.getElementType() != "Earth"){
					((Monster) your.field.get(i)).monsterHP.damage(2);
					System.out.print("\n\n-> " + your.field.get(i).cardName.getName() + " took 2 damage.");
					sm.sleep();
				}
			}
			
		}
		for(int i = 0; i < opponent.field.count(); i++){
			if(opponent.field.get(i).cardType.getCardType() == "Monster"){
				if(((Monster) opponent.field.get(i)).elementType.getElementType() != "Earth"){
					((Monster) opponent.field.get(i)).monsterHP.damage(2);
					System.out.print("\n\n-> " + opponent.field.get(i).cardName.getName() + " took 2 damage.");
					sm.sleep();
				}
			}
			
		}
		sm.sleep();
		sm.sleep();
	}





}
