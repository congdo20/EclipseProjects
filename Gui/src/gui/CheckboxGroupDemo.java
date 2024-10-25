package gui;
import java.awt.*;
import java.io.Serializable;


public class CheckboxGroupDemo extends Frame implements Serializable {
	private static final long serialVersionUID = 1L;
	private Checkbox red, green, blue;
	private CheckboxGroup checkGroup;
	public CheckboxGroupDemo(String sTitle) {
		super(sTitle);
		checkGroup = new CheckboxGroup();
		red = new Checkbox("Red", checkGroup, false);
		green = new Checkbox("Green", checkGroup, false);
		blue = new Checkbox("Blue", checkGroup, false);
		
		Panel north = new Panel();
		north.add(red);
		north.add(green);
		north.add(blue);
		this.add(north, BorderLayout.NORTH);
		
		SetColor listener = new SetColor(this);
		red.addItemListener(listener);
		green.addItemListener(listener);
		blue.addItemListener(listener);
			
	}
	
	public static void main(String[] args) {
		Frame f = new CheckboxGroupDemo("CheckbocGroup Demo");
		f.setSize(300, 300);
		f.setVisible(true);
	}
	
	
}
