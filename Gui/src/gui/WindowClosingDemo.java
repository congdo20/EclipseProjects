package gui;
import java.awt.*;

public class WindowClosingDemo {
	public static void main(String[] args) {
		Frame fr = new Frame("WindowClosing Demo");
		WindowCloser closer = new WindowCloser();
		fr.addWindowListener(closer);
		fr.setBounds(10, 10, 300, 200);
		fr.setVisible(true);		
	}
}
