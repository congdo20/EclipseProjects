package gui;
import java.awt.*;
import java.awt.event.*;

public class FrameDemo {

	public static void closeWindowExit(Frame fr) {
		fr.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				});
	}
	
	public static void closeWindowItem(MenuItem item) {
		item.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
	}
	

	public static void main(String[] args) {
		Frame fr = new Frame("Frame Demo");
		
		fr.setLayout(new BorderLayout());
		
		MenuBar menu = new MenuBar();
		Menu file = new Menu("File");
		Menu help = new Menu("Help");
		MenuItem fNew = new MenuItem("New File");
		MenuItem fOpen = new MenuItem("Open File");
		MenuItem hUpdate = new MenuItem("Update");
		MenuItem hTopic = new MenuItem("Topic");
		menu.add(file);
		menu.add(help);
		file.add(fNew);
		file.add(fOpen);
		help.add(hUpdate);
		help.add(hTopic);
		fr.setMenuBar(menu);
		
		Button buttOk = new Button("OK");
		fr.add(buttOk, BorderLayout.NORTH);
		
		List li = new List();
		for(int i = 0; i < 10; i++) {
			li.add(Integer.toString(i));
		}
		fr.add(li, BorderLayout.EAST); // dong
		
		
		fr.add(new Checkbox("Pick me", true), BorderLayout.SOUTH);
		
		fr.add(new Label("Enter your name: "), BorderLayout.WEST); // tay
		
		fr.add(new TextField(), BorderLayout.CENTER);
		
		closeWindowExit(fr);
		closeWindowItem(hUpdate);
		
		
		
		fr.setBounds(0, 0, 640, 480);
		fr.pack();
		fr.setVisible(true);
	
		
		
	}
}
