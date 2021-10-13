package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Print_users_data extends JFrame implements ActionListener {
    private JPanel prinitng_panel;
    private JScrollPane users_field;
    Katalog katalog = new Katalog();

    public Print_users_data(String title){
        super(title);
        JFrame frame2 = new JFrame(title);
        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setBackground(Color.BLUE);
        frame2.setContentPane(prinitng_panel);
        frame2.pack();
        frame2.setLocationRelativeTo(null);
        ImageIcon image = new ImageIcon("img/biceps.jpg");
        frame2.setIconImage(image.getImage());
        frame2.setVisible(true);
        for (Person element : katalog.listaOsob) {
            users_field.add(String.valueOf(element), null);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
