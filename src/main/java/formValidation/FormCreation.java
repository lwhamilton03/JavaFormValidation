
package formValidation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCreation implements ActionListener {
	
	TextField TxtField; 
	
	public void actionPerformed(ActionEvent create)
	{
		
		System.out.println("YOU JUST CLICKED THE BUTTON");
		
		TxtField.setText("SUCCESSFUL CLICK");
		TxtField.setBackground(Color.PINK);
		//TextField logInBox = new TextField(); 
		//logInBox.setVisible(true);
		//logInBox.setText("HELLO WORLD");
	}
	
	public FormCreation(TextField X)
	{
		TxtField = X; 
	}
} 


	


