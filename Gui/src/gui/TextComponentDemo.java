package gui;
import java.awt.*;
import java.io.Serializable;
public class TextComponentDemo extends Frame implements Serializable{
	private static final long serialVersionUID = 1L;
	private TextField textField;
	private TextArea textArea;
	private Button enter, clear;
	
	public TextComponentDemo(String sTitle) {
		super(sTitle);
		textArea = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		textArea.setEditable(false);
		
		textField = new TextField();
		enter = new Button("Enter");
		clear = new Button("Clear");
		
		this.add(textArea, BorderLayout.CENTER);
		
		Panel southEast = new Panel(new BorderLayout());
		southEast.add(enter, BorderLayout.EAST);
		southEast.add(clear, BorderLayout.WEST);
		
		
		Panel south = new Panel(new BorderLayout());
		south.add(textField, BorderLayout.CENTER);
		south.add(southEast, BorderLayout.EAST);
		
		this.add(south, BorderLayout.SOUTH);
		
		CreateList listener = new CreateList(textField, textArea);
		enter.addActionListener(listener);
		clear.addActionListener(listener);
		textField.addActionListener(listener);
		
	}
	
	public TextField getTextField() {
		return textField;
	}
	
	public static void main(String[] args) {
		TextComponentDemo f = new TextComponentDemo("TextCoponent Demo");
		f.setSize(300, 200);
		f.setVisible(true);
		f.getTextField().requestFocus();		
	}
	
	
	
	
}
