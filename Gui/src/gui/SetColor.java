package gui;
import java.awt.*;
import java.awt.event.*;
public class SetColor implements ItemListener {
	private Frame pallette;
	private Color c;
	public SetColor(Frame c) {
		pallette = c;
	}
	
	public void itemStateChanged(ItemEvent e) {
		String item = (String)e.getItem();
		//int state = e.getStateChange();
		if(item.equalsIgnoreCase("red"))
			 c = new Color(255, 0, 0);
		if(item.equalsIgnoreCase("green"))
			c = new Color(0, 255, 0);
		if(item.equalsIgnoreCase("blue"))
			c = new Color(0, 0 , 255);
		pallette.setBackground(c);
	}
}
