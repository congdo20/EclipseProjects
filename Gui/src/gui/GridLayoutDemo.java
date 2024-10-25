package gui;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutDemo {
	public static void main(String[] args) {
		Frame fr = new Frame("GridLayout Demo");
		fr.setLayout(new GridLayout(3, 2));
		
		fr.add(new Button("Red"));
		fr.add(new Button("Green"));
		fr.add(new Button("Blue"));
		
		fr.add(new Checkbox("Pick me", true));
		fr.add(new Label("Enter name here"));
		fr.add(new TextField());
		
		MenuBar menu = new MenuBar();
		Menu edit = new Menu("Edit");
		MenuItem eCopy = new MenuItem("Copy Cmd + C");
		MenuItem ePaste = new MenuItem("Paste cmd + V");
		edit.add(eCopy);
		edit.add(ePaste);
		
		
		
		Menu help = new Menu("Help");
		menu.add(edit);
		menu.add(help);
		fr.setMenuBar(menu);
		
		
		
		fr.pack();
		fr.setVisible(true);
		
		
		fr.addWindowListener(
			new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
		
		
		
		
	}
}
