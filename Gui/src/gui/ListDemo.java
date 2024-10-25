package gui;
import java.awt.*;
import java.io.Serializable;


public class ListDemo extends Frame implements Serializable {
	private static final long serialVersionUID = 1L;
	private List li;
	private Label selected;
	public ListDemo(String title) {
		super(title);
		li = new List();
		li.add("Monday");
		li.add("Tuesday");
		li.add("Wednesday");
		li.add("Thursday");
		li.add("Friday");
		li.add("Saturday");
		li.add("Sunday");
		
		selected = new Label("Double click a day:", Label.CENTER);
		this.setLayout(new BorderLayout());
		
		this.add(selected, BorderLayout.NORTH);
		this.add(li, BorderLayout.CENTER);
		
		ShowSelectionListener listener = new ShowSelectionListener(selected);
		li.addActionListener(listener);
	}
	
	public static void main(String[] args) {
		ListDemo f = new ListDemo("List Demo");
		f.setBounds(10, 10, 300, 200);
		f.setVisible(true);
	}
}
