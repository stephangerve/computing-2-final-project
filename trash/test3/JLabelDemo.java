import java.awt.*;
import javax.swing.*;

public class JLabelDemo extends JApplet{
	public static void main(String args[]){
		init();
	
	}

	public void makeGUI(){
		ImageIcon ii = new ImageIcon("france.gif");	
		JLabel j1 = new JLabel("Hello world", ii, JLabel.CENTER);

		add(j1);
	
	}




	public void init(){	
			/*try{*/
				SwingUtilities.invokeAndWait(
					new Runnable(){
						makeGUI();
					}		
					
					
				);
			/*}
			catch(Exception exc){
				System.out.println("Can't create because of " + exc);
			}*/	

	
	}
}
