package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Hydra extends Monster{
	
	public Hydra(){
		super("Hydra", "Silver", "Water", 19, 16, 15, 7);	
		cost.setSilverCoins(1);
		cost.setWaterMana(2);
		value.setBronzeCoins(2);
		value.setWaterMana(1);

		setAbilityName("Repeat");
		setAbilityDesc("Can attack twice.");

		
	}
	public void useAbility(Player opponent){
		//this.atk.resetHasBattled();
		
	}
}
