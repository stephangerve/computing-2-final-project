//MDBMenu.java
package Menus;
import Cards.*;
import java.util.*;




public class MDBMenu extends Menu{

	MonsterDatabase mDB;
	//***********************M O V E  T H I S  T O  M O N S T E R D A T A B A S E  C L A S S *****************
	public void showOptions(){
		mDB = new MonsterDatabase();
		//mDB.constructDatabase();
		while(getChoice() != 0){
		clearScreen();
		System.out.println("============================================");
		System.out.println("\tMonsters ");
	    	System.out.println("      Total count: ");
	    	System.out.println("\t   " + mDB.count());
		System.out.println("Number of Fire Monsters: " + mDB.getFireCount());
	    	System.out.println("Number of Water Monsters: " + mDB.getWaterCount());
	    	System.out.println("Number of Earth Monsters: " + mDB.getEarthCount());
	    	System.out.println("Number of Dark Monsters: " + mDB.getDarkCount());
	   	System.out.println("Number of Light Monsters: " + mDB.getLightCount());	
		System.out.println();
		System.out.println("Number of Bronze level Monsters: " + mDB.getBronzeCount());
	    	System.out.println("Number of Silver level Monsters: " + mDB.getSilverCount());
	    	System.out.println("Number of Gold level Monsters: " + mDB.getGoldCount());	
		mDB.printCardDatabase();		

	    	System.out.println("    _________________________________");
	    	System.out.println("   |Enter No. of monster to see info |");
	    	System.out.println("   |Enter 0 to return back to main   |");
	    	System.out.println("    ---------------------------------");
		System.out.print(">> ");
	    	makeChoice();
	        if(getChoice() > 0){
	            //this could be made into a function, display card() maybe
	        	System.out.println();
	        	System.out.println();
	        	System.out.println(getChoice() + ".");
	        	mDB.get(getChoice() - 1).getCardInfo();
			sleep();
			sleep();
			sleep();
			System.out.println();
			System.out.println("Enter any number to return.");
			enterString();
	        }
		else if(getChoice() == 0){
			System.out.println("============================================");			
			sleep();

		}
	        else {
	       		System.out.println();
                        System.out.println();
                	System.out.println("-> Invalid entry. Please try again.");
	        }
	    }



	}
	





}
