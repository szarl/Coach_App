package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class First_view extends JFrame {
    private JPanel mainPanel;
    private JButton add_account;
    private JPasswordField password;
    private JButton login;
    private JLabel login_str;
    private JLabel haslo_str;
    private JTextField username;
    Katalog katalog = new Katalog();
    Katalog justIT = new Katalog("1" , "1", "1", "1", "1", true);

    public First_view(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.DARK_GRAY);
        this.setContentPane(mainPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        ImageIcon image = new ImageIcon("img/biceps.jpg");
        this.setIconImage(image.getImage());
        this.setVisible(true);

        login.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                if (Katalog.check_status(username.getText(), String.valueOf(password.getPassword()))) {
                    JOptionPane.showMessageDialog(null, "Zalogowano!");
                    First_view.super.dispose();
                    Exe_trener app = new Exe_trener("Coach storage");
                } else {
                    JOptionPane.showMessageDialog(null, "Błędne dane, spróbuj jeszcze raz");
                }
            }
        });

        add_account.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                First_view.super.dispose();
                Registration rejestracja = new Registration("Rejestracja");
            }
        });
    }
}
