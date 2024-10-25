package gui;
import java.awt.*;
import java.awt.event.*;

public class MessageBox {
	Dialog msgBox;
	
	public MessageBox(Frame parentWindow, String msg, String title) {
		if(parentWindow == null) {
			Frame emptyWin = new Frame();
			msgBox = new Dialog(emptyWin, title, true);
		} else {
			msgBox = new Dialog(parentWindow, title, true);
		}
		
		Label Message = new Label(msg);
		msgBox.setLayout(new FlowLayout());
		msgBox.add(Message);
		
		Button okButton = new Button("OK");
		msgBox.add(okButton);
		msgBox.setSize(200, 100);
		
		okButton.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					msgBox.dispose();
				}
			}
		);
	}
	
	public void showMessage() {
		msgBox.setVisible(true);
	}
	
	
}
