package gui;
import javax.swing.*;
import java.awt.event.*;

public class DialogExample {
    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("Frame Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Tạo nút để mở dialog
        JButton button = new JButton("Open Dialog");
        button.setBounds(130, 100, 120, 40);
        
        // Thêm action listener cho nút
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Tạo JDialog
                JDialog dialog = new JDialog(frame, "Dialog Example", true);
                dialog.setSize(200, 150);
                dialog.setLayout(null);
                
                // Thêm một nhãn vào dialog
                JLabel label = new JLabel("This is a dialog");
                label.setBounds(50, 40, 100, 20);
                dialog.add(label);

                // Hiển thị dialog
                dialog.setVisible(true);
            }
        });

        // Thêm nút vào JFrame
        frame.add(button);

        // Hiển thị JFrame
        frame.setVisible(true);
    }
}
