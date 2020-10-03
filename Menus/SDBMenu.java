//SDBMenu.java
package Menus;
import Cards.*;
import java.util.*;




public class SDBMenu extends Menu{

	SpellDatabase sDB;
	//***********************M O V E  T H I S  T O  Spell D A T A B A S E  C L A S S *****************
	public void showOptions(){
		sDB = new SpellDatabase();
		//mDB.constructDatabase();
		System.out.println("============================================");
		sDB.printCardDatabase();		
		System.out.println("============================================");
		
	}






}
