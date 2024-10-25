package gui;
import java.awt.*;
import java.awt.event.*;


public class CreateList implements ActionListener{
	private int counter = 0;
	private TextField source;
	private TextArea destination;
	
	public CreateList(TextField s, TextArea d) {
		source = s;
		destination = d;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if(action.equalsIgnoreCase("Enter")) {
			String text = source.getText();
			counter++;
			destination.append(counter + "." + text + "\n");
			source.setText("");
		} else {
			if(action.equalsIgnoreCase("Clear")) {
				destination.setText("");
				counter = 0;
			}
		}		
	}
}
