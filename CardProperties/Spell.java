//Spell.java
package CardProperties;
import GameProperties.*;
import Menus.*;
import java.util.*;




public abstract class Spell extends Card{

	String spellDesc;
	public SpellMenu sm;

	public Spell(String sName){
		super(sName, "Spell");
		sm = new SpellMenu();
	}
	
	public void getSpecificCardInfo(){
		System.out.println("Effect:");
		System.out.println(getSpellDesc());
		System.out.println("==================");
		System.out.println();
	}
	public void setSpellDesc(String spellDesc){
		this.spellDesc = spellDesc;
	}
	public String getSpellDesc(){
		return this.spellDesc;
	}
	public abstract void activateSpell(Player your, Player opponent);
}
