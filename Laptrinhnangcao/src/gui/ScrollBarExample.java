package gui;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScrollBarExample {
    JFrame frame;
    JPanel panel;
    JTextArea area;
    JTextField field;
    JScrollPane scrollpane;
    
    public static void main(String[] args) {
        ScrollBarExample v = new ScrollBarExample();
        System.out.println(v);
    }
    public ScrollBarExample() {
        frame = new JFrame("ScrollBarExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        field = new JTextField(7);
        area = new JTextArea("This is text area", 5, 7);
        scrollpane = new JScrollPane(area);
        scrollpane.getHorizontalScrollBar().addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                field.setText("Position = " + e.getValue());
            }
        });
        panel = new JPanel();
        panel.add(field);
        panel.add(scrollpane);
        frame.add(panel);
        frame.setVisible(true);

    }


}
