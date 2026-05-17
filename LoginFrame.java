package Movie;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    public LoginFrame() {
        setTitle("Movie Booking Login");
        setSize(420,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(null);
        panel.setBackground(new Color(245,248,250));

        JLabel title = new JLabel("Movie Ticket Booking");
        title.setBounds(90,20,300,30);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(Color.DARK_GRAY);
        panel.add(title);

        JLabel u = new JLabel("Username");
        u.setBounds(60,80,100,20);
        panel.add(u);

        JTextField user = new JTextField();
        user.setBounds(160,80,180,25);
        panel.add(user);

        JLabel p = new JLabel("Mobile No");
        p.setBounds(60,120,100,20);
        panel.add(p);

        JTextField phone = new JTextField();
        phone.setBounds(160,120,180,25);
        panel.add(phone);

        JButton login = new JButton("LOGIN");
        login.setBounds(140,180,120,35);
        login.setBackground(new Color(80,170,120));
        login.setForeground(Color.WHITE);
        panel.add(login);

        login.addActionListener(e -> {
            UsserSession.username = user.getText();
            UsserSession.phone = phone.getText();
            dispose();
            new DashboardFrame();
        });

        add(panel);
        setVisible(true);
    }
}