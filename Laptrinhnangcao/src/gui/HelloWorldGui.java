package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloWorldGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World!");
        frame.setSize(220, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container contentPane = frame.getContentPane();
        contentPane.setLayout(null);

        JButton button = new JButton("Hello World!");
        button.setLocation(30, 30);
        button.setSize(150, 100);
        button.addActionListener(new MyActionListener());
        contentPane.add(button);

        frame.setVisible(true);

    }

    public static class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("You have click button");
        }
    }
}
