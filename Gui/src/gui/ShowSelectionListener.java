package gui;
import java.awt.*;
import java.awt.event.*;


public class ShowSelectionListener implements ActionListener{
	private Label lab;
	public ShowSelectionListener(Label label_sel) {
		lab = label_sel;
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(!(source instanceof List)) {
			return;
		} else {
			List li = (List) source;
			String selected = li.getSelectedItem();
			lab.setText(selected);
		}	
	}
}
