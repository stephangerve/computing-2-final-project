import java.util.*;




class Demo{



	public static void main(String args[]){

		new Demo();	
	}
	Demo(){
	
		try{
			method();
		}
		catch(MyException e){
			System.out.println(e);
		}
	}

	public void method() throws MyException{
		throw new MyException("message");
	}


}
