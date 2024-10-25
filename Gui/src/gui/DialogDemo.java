package gui;
import java.awt.*;
import java.awt.event.*;

public class DialogDemo {
	public static void main(String[] args) {
		createMenu();
	}
	
	public static void createMenu() {
		final Frame fr = new Frame();
		fr.setLayout(new BorderLayout());
		
		MenuBar menubar = new MenuBar();
		Menu mTest = new Menu("Test");
		MenuItem testDlg = new MenuItem("Test Dialog");
		testDlg.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MessageBox msgBox = new 
					MessageBox(fr, "Here it is", "T/bao Dialog");
					msgBox.showMessage();
				}
			}
		);
		
		mTest.add(testDlg);
		menubar.add(mTest);
		fr.setMenuBar(menubar);
		fr.setBounds(100, 100, 300, 200);
		fr.setVisible(true);
		
		
		fr.addWindowListener(
			new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			}
		);
		
	}

}
