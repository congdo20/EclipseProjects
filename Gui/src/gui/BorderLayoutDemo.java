package gui;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;


class BorderLayoutDemo extends Frame implements Serializable{
	private static final long serialVersionUID = 1L;  // Thêm trường này để khắc phục lỗi

	private Button north, south, east, west, center;
	
	public BorderLayoutDemo(String sTitle) {
		super(sTitle);
		north = new Button("North");
		south = new Button("South");
		east = new Button("East");
		west = new Button("West");
		center = new Button("Center");
		
		this.add(north, BorderLayout.NORTH);
		this.add(south, BorderLayout.SOUTH);
		this.add(east, BorderLayout.EAST);
		this.add(west, BorderLayout.WEST);
		this.add(center, BorderLayout.CENTER);
		
		
	}
	
	public static void main(String[] args) {
		Frame fr = new BorderLayoutDemo("BorderLayout Demo");
		fr.pack();
		fr.setVisible(true);
		
		MenuBar menu = new MenuBar();
		Menu edit = new Menu("Edit");
		Menu help = new Menu("Help");
		menu.add(edit);
		menu.add(help);
		fr.setMenuBar(menu);
		
		
		fr.addWindowListener(
			new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
		
		
		
	}
}
