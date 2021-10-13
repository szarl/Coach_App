package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Add_Small_User {

    private JPanel panelAdd;
    private JTextField name_field;
    private JTextField surname_field;
    private JLabel name_label;
    private JLabel surname_label;
    private JTextField dob_field;
    private JLabel dob_label;
    private JTextField weight_field;
    private JTextField height_field;
    private JTextField phoneN_field;
    private JTextField email_field;
    private JComboBox plecComboBox;
    private JLabel sex_label;
    private JLabel weight_label;
    private JLabel height_label;
    private JLabel phoneN_label;
    private JLabel email_label;
    private JTextField goal_field;
    private JLabel goal_label;
    private JButton action_save;
    private JButton back;


    public Add_Small_User() {
        JFrame frame3 = new JFrame();
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setBackground(Color.DARK_GRAY);
        frame3.setContentPane(panelAdd);
        frame3.pack();
        frame3.setLocationRelativeTo(null);
        ImageIcon image = new ImageIcon("img/biceps.jpg");
        frame3.setIconImage(image.getImage());
        frame3.setVisible(true);
        Katalog katalog = new Katalog();

        plecComboBox.addItem("kobieta");
        plecComboBox.addItem("mezczyzna");

        action_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String imie = name_field.getText();
                String nazwisko = surname_field.getText();
                String data_urodzenia = dob_field.getText();
                Boolean plec;
                if (plecComboBox.getItemAt(0) == "mezczyzna")
                    plec = true;
                else
                    plec = false;
                Float waga = weight_field.getAlignmentX();
                Float wzrost = height_field.getAlignmentX();
                String numer_tel = phoneN_field.getText();
                String email = email_field.getText();
                Float waga_docelowa = goal_field.getAlignmentX();
                Person podopieczny = new Podopieczny(imie, nazwisko, data_urodzenia, plec, waga, wzrost, numer_tel, email, waga_docelowa, false);

                katalog.listaOsob.add(podopieczny);

                for (Person person : katalog.listaOsob) {
                    System.out.println(person.getData_Storage());
                }
                JOptionPane.showMessageDialog(null, "Pomyślnie dodano uzytkownika!");
                frame3.setVisible(false);
                Exe_trener mainpanel = new Exe_trener("Coach storage");
            }

        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame3.setVisible(false);
                Exe_trener backTo = new Exe_trener("Coach storage");
            }
        });
    }
}
