//Mpnster.java
package CardProperties;
import GameProperties.*;
import java.util.*;




public class Monster extends Card{

	public Battle atk;
	public Battle def;
	public HP monsterHP;
	public Level monsterLevel;
	public ElementType elementType;
	String abilityName;
	String abilityDesc;	
	boolean usedAbility;

	public Monster(String mName, String mLevel, String mElement, int a, int d, int c, int h){
		super(mName, "Monster");
		atk = new Battle(a,c);
		def = new Battle(d,c);
		monsterHP = new HP(h);
		monsterLevel = new Level(mLevel);
		elementType = new ElementType(mElement);
	}
	
	public void getSpecificCardInfo(){
		System.out.println("------------------");
		System.out.println(elementType.getElementType() + " Type");
		System.out.println("------------------");
		System.out.println("Critical Battle Values:");
		System.out.print("atk: " + atk.getCriticalHit());
		System.out.println(" def: " + def.getCriticalHit());
		System.out.println("crit. chance: " + atk.getCriticalChance() + "%");
		System.out.println("------------------");
		System.out.println("Ability: ");
		System.out.println(getAbilityName());
		System.out.println(getAbilityDesc());
		System.out.println("==================");
		System.out.println();
	}
	public void getMonsterInfo(){
		System.out.print(cardName.getName());
		System.out.print("(" + atk.getCriticalHit() + ",");
                System.out.print(def.getCriticalHit() + ",");
                System.out.print(monsterHP.getInitialHP() + ")");
	}

	public void ability(Player opponent){
	
	}
	public void setAbilityName(String abilityName){
		this.abilityName = abilityName;
	}
	public void setAbilityDesc(String abilityDesc){
		this.abilityDesc = abilityDesc;
	}
	public String getAbilityName(){
		return abilityName;
	}
	public String getAbilityDesc(){
		return abilityDesc;
	}
	public void useAbility(Player opponent){
		if(abilityReq() == true){
			setUsedAbility();
			ability(opponent);			
		}	
	}
	public void setUsedAbility(){
		usedAbility = true;
	}
	public boolean getUsedAbility(){
		return usedAbility;
	}
	public void resetUsedAbility(){
		usedAbility = false;	
	}
	public boolean abilityReq(){
		if(atk.getHasBattled() == true){
			System.out.println();
			System.out.println();
			System.out.print("-> ");
			System.out.println("Monster's ability cannot be used; It can attack or use ability once per turn but not both..");
			return false;
		}
		else if(getUsedAbility() == true){
			System.out.println();
			System.out.println();
			System.out.print("-> ");
			System.out.println("Monster's ability can only be used once per turn.");
	
	
			return false; 
		}
		return true;

	}





}
