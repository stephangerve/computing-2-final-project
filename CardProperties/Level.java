package CardProperties;
import java.util.*;



public class Level{
	
	String monsterLevel;
	public Level(String monsterLevel){
		setMonsterLevel(monsterLevel);
	}


	public void setMonsterLevel(String monsterLevel){
		if(checkMonsterLevel(monsterLevel) == true){
			this.monsterLevel = monsterLevel;
		}
	}

	public String getMonsterLevel(){
		return monsterLevel;
	}
	public boolean checkMonsterLevel(String cml){
		if(cml == "Bronze"){
			return true;
		}
		else if(cml == "Silver"){
			return true;
		}	
		else if(cml == "Gold"){
			return true;
		}
		else{
			return false;
		}
	}



}
