package gui;
import java.awt.*;
import java.io.Serializable;

import java.awt.event.*;

public class PanelDemo extends Frame implements Serializable{
	private static final long serialVersionUID = 1L;
	private Button next, prev, first;
	private List li;
	
	public PanelDemo(String sTitle) {
		super(sTitle);
		next = new Button("Next >>");
		prev = new Button("<< Prev");
		first = new Button("First");
		
		Panel southPanel = new Panel();
		southPanel.add(next);
		southPanel.add(prev);
		southPanel.add(first);
		this.add(southPanel, BorderLayout.SOUTH);
		first.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Dialog dialog = new Dialog(PanelDemo.this, "Dialog Example", false);
		                dialog.setSize(200, 150);
		                dialog.setLayout(null);
		                
		                // Thêm một nhãn vào dialog
		                Label label = new Label("This is a dialog");
		                label.setBounds(50, 40, 100, 20);
		                dialog.add(label);
		                
		                dialog.addWindowListener(new WindowAdapter() {
							public void windowClosing(WindowEvent e) {
								System.exit(0);
							}
						});
		                

		                // Hiển thị dialog
		                dialog.setVisible(true);
					}
					
				});
		
		
		
		
		Panel northPanel = new Panel();
		northPanel.add(new Label("Make a selection"));
		this.add(northPanel, BorderLayout.NORTH);
		
		li = new List();
		for (int i = 0; i < 10; i++) {
			li.add("Selection " + i);
		}
		this.add(li, BorderLayout.CENTER);
		
	}
	
	
	public static void main(String[] args) {
		Frame f = new PanelDemo("Panel Demo");
		f.setSize(300, 200);
		f.setVisible(true);
		f.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				});
		
		
	}
}
