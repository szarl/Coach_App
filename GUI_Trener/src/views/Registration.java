package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Registration extends JFrame{
    private JLabel text1;
    private JLabel name_ba;
    private JLabel surname_ba;
    private JLabel date_of_birth_ba;
    private JLabel login_ba;
    private JLabel password_ba;
    private JTextField name_space;
    private JTextField surname_space;
    private JTextField date_space;
    private JTextField login_space;
    private JPasswordField password_space;
    private JPanel panel1;
    private JButton createAccount;
    private JButton back;


    public Registration(String title) {
        super(title);
        JFrame frame1 = new JFrame(title);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setBackground(Color.DARK_GRAY);
        frame1.setContentPane(panel1);
        frame1.pack();
        frame1.setLocationRelativeTo(null);
        ImageIcon image = new ImageIcon("img/biceps.jpg");
        frame1.setIconImage(image.getImage());
        frame1.setVisible(true);
        Katalog katalog = new Katalog();

        createAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String imie = name_space.getText();
            String nazwisko = surname_space.getText();
            String data_urodzenia = date_space.getText();
            String login = login_space.getText();
            String haslo = String.valueOf(password_space.getPassword());
            Person osoba = new Trener(imie, nazwisko, data_urodzenia, login, haslo, true);
            katalog.listaOsob.add(osoba);

            for(Person person: katalog.listaOsob){
                System.out.println(person.getData_Storage());
          }
                JOptionPane.showMessageDialog(null, "Pomyślnie utworzono konto!");
                frame1.setVisible(false);
                First_view mainpanel = new First_view("Coach storage");
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame1.setVisible(false);
                First_view mainpanel = new First_view("Coach storage");
            }
        });
    }
}
