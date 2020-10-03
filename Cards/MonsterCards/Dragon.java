//Dragon.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Dragon extends Monster{
	
	public Dragon(){
		super("Dragon", "Gold", "Fire", 25, 17, 35, 8);	
		cost.setGoldCoins(1);
		cost.setFireMana(3);
		value.setSilverCoins(2);
		value.setBronzeCoins(1);
		value.setFireMana(1);

		setAbilityName("Burn");
		setAbilityDesc("Deal 3 damage to enemy monster.");

	}

}
