package gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
//import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWTCounter extends Frame {
    private Label label;
    private TextField textField;
    private Button button;
    private int count = 0;
    public AWTCounter() {
        setLayout(new FlowLayout());
        //setLayout(new GridLayout(3,1));
        label = new Label("Counter");
        add(label);
        textField = new TextField(count + "", 10);
        add(textField);
        button = new Button ("Counter");
        add(button);
        // inner class
        BtnCountListener listener = new BtnCountListener();
        button.addActionListener(listener);
        /*
        // lop vo danh
        button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText((++count) + "");
        }      
        });
        */
        setTitle("AWT Counter");
        setSize(300, 100);
        setVisible(true);
    }

    public class BtnCountListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText((++count) + "");
        }
    }

    

    public static void main(String[] args) {
        AWTCounter app = new AWTCounter();
        /*
        app.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Cua so duoc dong.");
                System.exit(0);
            }
        });
        */

        // WindowAdapter trien khia giao dien WindowListener
        app.addWindowListener(new WindowListener() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Cua so duoc dong.");
                System.exit(0);
            }

            @Override public void windowOpened(WindowEvent e) {}
            @Override public void windowClosed(WindowEvent e) {}
            @Override public void windowIconified(WindowEvent e) {}
            @Override public void windowDeiconified(WindowEvent e) {}
            @Override public void windowActivated(WindowEvent e) {}
            @Override public void windowDeactivated(WindowEvent e) {}



        });

    }
}
