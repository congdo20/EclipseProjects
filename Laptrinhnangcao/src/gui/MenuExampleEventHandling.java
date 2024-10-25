package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuExampleEventHandling {
    static JFrame frame;
    public static void main(String[] args) {
        frame = new JFrame("My Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("New"));
        fileMenu.add(new JMenuItem("Open"));

        JMenuItem item = new JMenuItem("Close");
        item.addActionListener(new MenuActionListener());
        fileMenu.add(item);

        JMenu editMenu = new JMenu("Edit");
        editMenu.add(new JMenuItem("Undo"));
        editMenu.add(new JMenuItem("Redo"));
        editMenu.add(new JMenuItem("Cut"));

        JMenuBar menubar = new JMenuBar();
        menubar.add(fileMenu);
        menubar.add(editMenu);

        frame.setSize(300, 200);
        frame.setJMenuBar(menubar);
        frame.setVisible(true);


    }


    public static class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(MenuExampleEventHandling.frame, "Got an ActionEvent at " + new Date(e.getWhen()) + " from " + e.getSource().getClass());
        }
    }
}
