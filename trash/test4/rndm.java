import java.util.*;


public class rndm{


	public static void main(String args[]){
		Random rand = new Random(System.currentTimeMillis());
		for(int i = 0; i < 10; i++){
			System.out.println(rand.nextInt(2));
		}
		
	
	}


}
