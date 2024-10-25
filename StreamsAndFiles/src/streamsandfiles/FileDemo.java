package streamsandfiles;
import java.io.*;
import java.awt.*;
import java.awt.event.*;


public class FileDemo {
	public static void main(String[] args) {
		Frame fr = new Frame("File Demo");
		fr.setLayout(new BorderLayout());
		fr.setBounds(10, 10, 300, 200);
		
		
		Panel p = new Panel(new GridLayout(1,2));
		
		List list_C = new List();
		list_C.add("/Users/trinhdo/Documents/linh tinh");
		File driver_C = new File("/Users/trinhdo/Documents/linh tinh");
		String[] dirs_C = driver_C.list();
		
		for (int i = 0; i< dirs_C.length; i++) {
			File f = new File(driver_C, dirs_C[i]);
			if (f.isDirectory()) 
				list_C.add("<DIR>" + dirs_C[i]);
			else 
				list_C.add("    " + dirs_C[i]);
		}
		
		List list_D = new List();
		list_D.add("/Users/trinhdo/Documents/IT");
		File driver_D = new File("/Users/trinhdo/Documents/IT");
		String[] dirs_D = driver_D.list();
		for (int i = 0; i < dirs_D.length; i++) {
			File f = new File("/Users/trinhdo/Documents/IT", dirs_D[i]);
			if(f.isDirectory())
				list_D.add("<DIR>" + dirs_D[i]);
			else 
				list_D.add("    " + dirs_D[i]);
		}
		
		p.add(list_C);
		p.add(list_D);
		fr.add(p, BorderLayout.CENTER);
		fr.setVisible(true);
		
		
		fr.addWindowListener(
			new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
	
		
	}	
}
