//Player.java
package GameProperties;
import CardProperties.*;
import GameProperties.Zones.*;
import Menus.*;
import java.util.*;




public class Player{

	int turnCount;
	boolean hasSummoned;
	PlayerMenu pm;
	
	public Name playerName;
	public HP playerHP;
	public Deck deck;
	public Hand hand;
	public Field field;
	public Graveyard gyard;
	public Stats playerStats;
	public SummoningBank bank;
	public Player opponent;

	public Player(String pName){
		bank = new SummoningBank();
		playerStats = new Stats();
		playerName = new Name(pName);
		playerHP = new HP(20);
		deck = new Deck();
		hand = new Hand();
		field = new Field();
		gyard = new Graveyard();	
		pm = new PlayerMenu();
		turnCount = 0;
		deck.createRandomDeck();
		deck.shuffle();
		hand.makeHand(deck);
		getPlayerInfo();
		Menu.sleep();
		Menu.sleep();

	}
	public void setOpponent(Player opponent){
		this.opponent = opponent;
	}	
	public boolean lose(){
		if(deck.count() == 0){
			return true;
		}
		else if(playerHP.getActualHP() <= 0){
			return true;
		}
		else{
			return false;
		}
	}
	public void increTurnCount(){
		turnCount++;
	}
	public int getTurnCount(){
		return turnCount;
	}
	public void setHasSummoned(){
		hasSummoned = true;
	}
	public boolean getHasSummoned(){
		return hasSummoned;
	}
	public void resetHasSummoned(){
		hasSummoned = false;		
	}
	public void draw() throws Message{
		if(hand.count() == 7){
			throw new Message(2, "drawnt", "maxih");
		}
		else if(hand.count() < 7){
			hand.addCard(deck.transferCard(deck.lastIndexOf(deck.lastCard())));
			throw new Message(1, hand.lastCard().cardName.getName(), "draw");
			
		}
	}
	public void discard(int index, Zone previous) throws Message{
		gyard.addCard(previous.transferCard(index));
		throw new Message(1, gyard.lastCard().cardName.getName(), "dcard");

	}
	public void summon(int index) throws Message{
		if(field.count() == field.MAX()){
			throw new Message(2, "sumnot", "maxip");
		}
		else{
			if(hand.get(index).cardType.getCardType() == "Monster"){
				if(field.getMonsterCount() == 5){
                			throw new Message(2,"sumnot","maxmp");
				}
               	else if(field.getMonsterCount() < 5){
                 			field.addCard(hand.transferCard(index));
							setHasSummoned();
                        	throw new Message(1, field.lastCard().cardName.getName(), "summon");
				}
			}
			else if(hand.get(index).cardType.getCardType() == "Spell"){
				field.addCard(hand.transferCard(index));
				((Spell) field.lastCard()).activateSpell(this, opponent);
				try{
					this.discard(this.field.lastIndexOf(this.field.lastCard()), this.field);
				}
				catch(Message e){
					System.out.println(e);
					Menu.sleep();
				}
			}

                }
		/*else{
			field.addCard(hand.transferCard(index));
			throw new Message(1, field.lastCard().cardName.getName() , "summon");
		}*/

	}
	public void attack(int c, Player opponent){
		String nameOfCard = this.hand.get(c).cardName.getName();
		if(opponent.field.count() > 0){
			System.out.println("\tChoose enemy monster to attack.");
			System.out.println("\t----------");
			for (int i = 0; i < opponent.field.count(); i++){
				if (opponent.field.get(i).cardType.getCardType() == "Monster") {
					System.out.print("\t" + i + 1  + "." + opponent.field.get(i).cardName.getName());
					System.out.println();
				}
			}
			System.out.print(">> ");
			pm.makeChoice();
			System.out.print("\n\n->");
			System.out.println("you selected " + opponent.field.get(pm.getChoice() - 1).cardName.getName());
			//System.out.println();
			Menu.sleep();
			int a = ((Monster) this.field.get(c)).atk.hit();
			int d = ((Monster) opponent.field.get(pm.getChoice() - 1)).def.hit();
			((Monster) this.field.get(c)).atk.setHasBattled();
			pm.clearScreen();
			System.out.print("***********************************************");
			System.out.println("***********************************************");
			System.out.print(nameOfCard + " attacks: " + a + "\t");
			Menu.sleep();
			System.out.println(opponent.field.get(pm.getChoice() - 1).cardName.getName() + " defends: " + d);
			Menu.sleep();
			if(a == 0){
				System.out.println(this.field.get(c).cardName.getName() + " MISSED!!!");
				Menu.sleep();
			}
			else if(d == 0){
				System.out.println(opponent.field.get(pm.getChoice() - 1).cardName.getName() + " MISSED!!!");
				Menu.sleep();
			}
			((Monster) opponent.field.get(pm.getChoice() - 1)).monsterHP.damage(a - d);
			((Monster) this.field.get(c)).monsterHP.damage(d - a);
			//if attack greater than defense
			if(a - d > 0){
				System.out.print(opponent.field.get(pm.getChoice() - 1).cardName.getName());
				System.out.println(" take " + (a - d) + " damage. ");
				int h = ((Monster) opponent.field.get(pm.getChoice() - 1)).monsterHP.getActualHP();
				System.out.println("HP: " + h);
				Menu.sleep();
				if(h <= 0){
					try{
						opponent.discard(pm.getChoice() - 1, opponent.field);
					}
					catch(Message e){
						System.out.println(e);
						Menu.sleep();
					}
					//Battle damage to opponent
					opponent.playerHP.damage(-h);
					System.out.println("Battle damage to " + opponent.playerName.getName() + ": " + -h);
					Menu.sleep();
				}
				//...	
			}
			//if defense greater than attack
			else if(d - a > 0){
				System.out.print(this.field.get(c).cardName.getName());
                System.out.println(" take " + (d - a) + " damage. ");
                int h = ((Monster) this.field.get(c)).monsterHP.getActualHP();
                System.out.println("HP: " + h);
                Menu.sleep();
                if(h <= 0){
					try{
						this.discard(c, this.field);
					}
					catch(Message e){
						System.out.println(e);
						Menu.sleep();
					}
					//Battle damage to opponent
                    this.playerHP.damage(-h);
                    System.out.println("Battle damage to " + opponent.playerName.getName() + ": " + -h);
                    Menu.sleep();
				}
				//For battle activated abilities
				/*else if(){
					((Monster) your.field.get(c)).useAbility();
			
				}*/
			}
			Menu.sleep();
			Menu.sleep();
			Menu.sleep();
			Menu.sleep();
		}                                                                     
		if(opponent.field.count() == 0){
			int a = ((Monster) this.field.get(c)).atk.hit();
			((Monster) this.field.get(c)).atk.setHasBattled();
			pm.clearScreen();
			System.out.print("***********************************************");
			System.out.println("***********************************************");
			opponent.playerHP.damage(a);
			System.out.println("YOU ATTACK " + opponent.playerName.getName() + " DIRECTLY!");
			Menu.sleep();
			if (a == 0) {
				System.out.println("MISSED ATTACK!!!!");
			}
			System.out.println(a + " DAMAGE INFLICTED");
			Menu.sleep();
			int h = opponent.playerHP.getActualHP();
			System.out.println(opponent.playerName.getName() + "'s hp: " + h);
			Menu.sleep();
			Menu.sleep();
			Menu.sleep();
		
		}
	}
	public void addToBank(int index) throws Message{
		this.bank.deposit(this.hand.get(index));
		this.gyard.addCard(this.hand.transferCard(index));
		throw new Message(1, gyard.lastCard().cardName.getName(), "banked");
	}
	public void getPlayerInfo(){
    		System.out.println("\t\t\t    ___________________________________________________");
    		System.out.println("\t\t\t\t\t\t  " + playerName.getName());
    		System.out.print("\t\t\t   |hp: " + playerHP.getActualHP());
    		System.out.println();
    		System.out.print("\t\t\t   |bank-> ");
    		bank.getBankInfo();
    		System.out.println();
    		System.out.print("\t\t\t   |deck count: " + deck.count());
    		System.out.println();
    		System.out.print("\t\t\t   |hand count: " + hand.count());
   	 	System.out.println();
	    	System.out.print("\t\t\t   |graveyard count: " + gyard.count());
   	 	System.out.println();
    		System.out.print("\t\t\t   |turn(s): " + getTurnCount());
 	   	System.out.println();
    		System.out.println("\t\t\t    ---------------------------------------------------");
	}
	public void resetField(){
		for(int i = 0; i < field.count(); i++){
			if(field.get(i).cardType.getCardType() == "Monster"){
				((Monster) field.get(i)).atk.resetHasBattled();
				((Monster) field.get(i)).resetUsedAbility();
			}
		}
	}/*
	public void clearField(){
		for(int i = 0; i < field.count(); i++){
			if(field.get(i).cardType.getCardType() == "Monster"){
				if(((Monster) field.get(i)).monsterHP.getActualHP() <= 0){
					try{
						discard(i, field);
					}
					catch(Message e){
						System.out.println(e);
						Menu.sleep();
					}
				}
			}
		}
	}*/

	



}
