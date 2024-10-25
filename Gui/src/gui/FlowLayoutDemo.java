package gui;
import java.awt.*;
import java.lang.Integer;
import java.awt.event.*;

public class FlowLayoutDemo {
	public static void main(String[] args) {
		Frame fr = new Frame("FlowLayout Demo");
		fr.setBounds(700, 250, 500, 500);
		fr.setLayout(new FlowLayout());
		fr.add(new Button("Red"));
		fr.add(new Button("Green"));
		fr.add(new Button("Blue"));
		
		List li = new List();
		for (int i = 0; i < 5; i ++) {
			li.add(Integer.toString(i));
		}
		
		fr.add(li);
		fr.add(new Checkbox("Pick me", true));
		fr.add(new Label("Enter your name: "));
		fr.add(new TextField(20));
		
		fr.pack();
		fr.setVisible(true);
		
		MenuBar menu = new MenuBar();
		
		Menu menuHelp = new Menu("Help");
		MenuItem	hAbout = new MenuItem("About");
		MenuItem	hTopic = new MenuItem("Topic");
		menuHelp.add(hTopic);
		menuHelp.add(hAbout);
		
		
		Menu menuEdit = new Menu("Edit");
		MenuItem eCopy = new MenuItem("Copy Cmd + C");
		MenuItem ePaste = new MenuItem("Paste Cmd + V");
		menuEdit.add(eCopy);
		menuEdit.add(ePaste);
		
		menu.add(menuEdit);
		menu.add(menuHelp);
		
		fr.setMenuBar(menu);
		fr.setResizable(true);
		fr.setTitle("Test");
		
		fr.addWindowListener(	
			new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
		
		
	}
}
