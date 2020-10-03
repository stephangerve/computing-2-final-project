import java.util.*;


public class Option{

	Option one, two, next;
	String descOne, descTwo, title;
	int choice;
	
	public Option(String title,String descOne, Option one, String descTwo, Option two){
		this.title = title;
		this.descOne = descOne;
		this.descTwo = descTwo;
		this.one = one;
		this.two = two;
	
	}
	public Option displayOption(){
		Scanner input = new Scanner(System.in);
		System.out.println(this.title);
		System.out.println("------------");
		System.out.println("[1] " + this.descOne);
		System.out.println("[2] " + this.descTwo);
		if(input.hasNextInt()){
			choice = input.nextInt();	
		}
		if(choice == 1){
			next = one;
		}
		if(choice == 2){
			next = two;
		}
		
		return next;
	
	}




}
