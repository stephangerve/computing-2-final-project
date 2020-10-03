//Phoenix.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Phoenix extends Monster{
	
	public Phoenix(){
		super("Phoenix", "Silver", "Fire", 16, 13, 25, 8);	
		cost.setSilverCoins(1);
		cost.setFireMana(1);
		cost.setAnyMana(1);
		value.setSilverCoins(1);
		
		setAbilityName("Reincarnate");
		setAbilityDesc("Instead of sent to graveyard after being destroyed, it is shuffled back into deck.");

	}

}
