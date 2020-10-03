//BlackHole.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class BlackHole extends Spell{

	public BlackHole(){
		super("Black Hole");
		//cost and value
		

		setSpellDesc("All monsters on field are sent to graveyard.");
	}
	public void activateSpell(Player your, Player opponent){
		for(int i = 0; i < your.field.count(); i++){
			if(your.field.get(i).cardType.getCardType() == "Monster"){
				try{
					your.discard(i, your.field);
				}
				catch(Message e){
					System.out.println(e);
					sm.sleep();
				}
			}
		}
		for(int i = 0; i < opponent.field.count(); i++){
			if(opponent.field.get(i).cardType.getCardType() == "Monster"){
				try{
					opponent.discard(i, opponent.field);
				}
				catch(Message e){
					System.out.println(e);
					sm.sleep();
				}
			}
		}
		sm.sleep();
		sm.sleep();
	}





}
