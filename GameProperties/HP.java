package GameProperties;
import java.util.*;


public class HP{

	private int actualHP;
	private int initialHP;
	
	public HP(int iHP){
		setInitialHP(iHP);
		setActualHP(iHP);
	}
	public void setInitialHP(int initialHP){
		this.initialHP = initialHP;
	}
	public int getInitialHP(){
		return initialHP;
	}
	public void setActualHP(int actualHP){
		this.actualHP = actualHP;
	}
	public int getActualHP(){
		return actualHP;
	}
	public void damage(int dmg){
		if(dmg > 0){
			actualHP -= dmg;
		}
	}


}
