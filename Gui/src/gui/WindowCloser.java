package gui;
import java.awt.event.*;

public class WindowCloser implements WindowListener{
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing...");
		System.exit(0);
	}
	
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated...");
	}
	
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed...");
	}
	
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconfied...");
	}
	
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconfied...");
	}
	
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened...");
	}
	
	public void windowDeactivated(WindowEvent e) {
        System.out.println("windowDeactivated...");
    }

}
