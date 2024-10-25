package gui;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;


public class KeyDemo extends Frame implements KeyListener, Serializable {
	private static final long serialVersionUID = 1L;  // Thêm trường này để khắc phục lỗi

	private String line1 = "", line2 = "", line3 = "";
	private TextArea textArea;
	
	public KeyDemo() {
		super("Demostrating Keystrole Events");
		textArea = new TextArea(10, 15);
		textArea.setText("Press any key on the keyboard...");
		textArea.setEnabled(false);
		this.add(textArea);
		
		addKeyListener(this);
		setSize(350, 100);
		setVisible(true);
	}
	
	public void keyPressed(KeyEvent event) {
		line1 = "Key pressed: " + KeyEvent.getKeyText(event.getKeyCode() );
		setLines2and3(event);
	}
	
	public void keyTyped(KeyEvent event) {
		line1 = "Key typed: " + event.getKeyChar();
		setLines2and3(event);
	}
	
	public void keyReleased(KeyEvent event) {
		line1 = "Key released: " + KeyEvent.getKeyText(event.getKeyCode());
        setLines2and3(event);
	}
	
	private void setLines2and3( KeyEvent event ) {
	line2 = "This key is " + ( event.isActionKey() ? "" : "not " ) + "an action key";
    String temp = KeyEvent.getModifiersExText(event.getModifiersEx());
	line3 = "Modifier keys pressed: " + ( temp.equals( "" ) ? "none" : temp );
	textArea.setText(line1+"\n"+line2+"\n"+ line3+"\n" );
	}
	
	
	public static void main(String[] args) {
		//KeyDemo application = new KeyDemo();
	}
	
	
	
	
	
	
}
