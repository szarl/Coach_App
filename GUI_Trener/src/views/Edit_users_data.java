package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Edit_users_data extends JFrame implements ActionListener {
    private JLabel Field_name;
    private JTextArea Jtext_name;
    private JTextField nazwiskoTextField;
    private JPanel Edit_data_user_panel;

    public Edit_users_data (String title){
        super(title);
        JFrame frame_edit_data = new JFrame(title);
        frame_edit_data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_edit_data.setBackground(Color.DARK_GRAY);
        frame_edit_data.setContentPane(Edit_data_user_panel);
        frame_edit_data.pack();
        frame_edit_data.setLocationRelativeTo(null);
        ImageIcon image = new ImageIcon("img/biceps.jpg");
        frame_edit_data.setIconImage(image.getImage());
        frame_edit_data.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
