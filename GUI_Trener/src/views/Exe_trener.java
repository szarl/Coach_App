package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exe_trener extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JButton add_user;
    private JButton edit_user;
    private JButton print_users;
    private JButton add_exercise;
    private JButton add_recipeToUser;
    private JButton add_exercisToUser;
    private JButton add_recipe;
    private JButton logout;

    public Exe_trener(String title){
        super(title);
        JFrame frame2 = new JFrame(title);
        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setBackground(Color.BLUE);
        frame2.setContentPane(mainPanel);
        frame2.pack();
        frame2.setLocationRelativeTo(null);
        ImageIcon image = new ImageIcon("img/biceps.jpg");
        frame2.setIconImage(image.getImage());
        frame2.setVisible(true);

        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                First_view kolo = new First_view("Coach storage");
                frame2.setVisible(false);
            }
        });
        add_user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Add_Small_User creating = new Add_Small_User();
                frame2.setVisible(false);
            }
        });
        edit_user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Edit_users_data ediit = new Edit_users_data("Edycja danch podopiecznego");
                frame2.setVisible(false);
            }
        });
        print_users.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Print_users_data print_data = new Print_users_data("Podopieczni");
                frame2.setVisible(false);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
