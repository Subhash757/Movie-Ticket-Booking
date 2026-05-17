package Movie;

import javax.swing.*;
import java.awt.*;

public class ProfileFrame extends JFrame {

    public ProfileFrame() {
        setTitle("Profile");
        setSize(400,300);
        setLayout(new GridLayout(6,1));

        add(new JLabel("Username: " + UsserSession.username, JLabel.CENTER));
        add(new JLabel("Phone: " + UsserSession.phone, JLabel.CENTER));
        add(new JLabel("Last Movie: " + UsserSession.movie, JLabel.CENTER));
        add(new JLabel());
        add(backBtn());

        setVisible(true);
    }

    JButton backBtn() {
        JButton b = new JButton("⬅ Back to Dashboard");
        b.addActionListener(e -> { dispose(); new DashboardFrame(); });
        return b;
    }
}