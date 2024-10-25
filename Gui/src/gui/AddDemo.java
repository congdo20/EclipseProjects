package gui;
import java.awt.*;
import java.awt.event.*;

public class AddDemo {
	public static void main(String[] args) {
		//Frame fr = new Frame("AddDemo App"); // tao doi tuong khung chua
		addFrameDemo();	
		//createMenu(fr);
	}
	
	
	public static void addFrameDemo() {
		Frame fr = new Frame("AddDemo App"); // tao doi tuong khung chua
		Button buttOk = new Button("OK");	// tao doi tuong component
		fr.add(buttOk); // gan vao khung chua
		fr.setBounds(700, 250, 500, 500);	// xac dinh kich thuoc
		//fr.setSize(500, 500);				
		fr.setResizable(true);
		fr.setVisible(true);
		
		
		fr.addWindowListener(
			new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
		
	}
	
	/*
	private static void createMenu() {
		// tao frame
		final Frame fr = new Frame();
		fr.setLayout(new BorderLayout());
		
		// tao menu bar
		MenuBar menu = new MenuBar();
		
		Menu menuEdit = new Menu("Edit");
		MenuItem copyItem = new MenuItem("Copy Ctrl + C");
		MenuItem pasteItem = new MenuItem("Paste Ctrll + V");
		menuEdit.add(copyItem);
		menuEdit.add(pasteItem);
		
		Menu menuHelp = new Menu("Help");
		MenuItem hTopicItem = new MenuItem("Help Topic");
		MenuItem hAboutItem = new MenuItem("About Calculator");
		menuHelp.add(hTopicItem);
		menuHelp.add(hAboutItem);
		
		menu.add(menuEdit);
		menu.add(menuHelp);
		
		fr.setMenuBar(menu);
		fr.setBounds(100, 100, 300, 200);
		fr.setTitle("Calculator");
		fr.setResizable(true);
		fr.setVisible(true);
		
		fr.addWindowListener( // xu ly su kien close
			new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			
	}
	*/
	
	
	
	
	
}
