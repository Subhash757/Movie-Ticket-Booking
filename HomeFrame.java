package Movie;

import javax.swing.*;
import java.awt.*;

public class HomeFrame extends JFrame {

    public HomeFrame() {
        setTitle("Movies");
        setSize(500,400);
        setLayout(new BorderLayout());

        add(new JLabel("Trending Movies", JLabel.CENTER), BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(3,1,10,10));
        JButton m1 = new JButton("Avatar 2");
        JButton m2 = new JButton("Salaar");
        JButton m3 = new JButton("Jawan");

        panel.add(m1); panel.add(m2); panel.add(m3);
        add(panel, BorderLayout.CENTER);

        add(backBtn(), BorderLayout.SOUTH);

        m1.addActionListener(e -> open("Avatar 2"));
        m2.addActionListener(e -> open("Salaar"));
        m3.addActionListener(e -> open("Jawan"));

        setVisible(true);
    }

    void open(String movie) {
        UsserSession.movie = movie;
        dispose();
        new MovieFrame();
    }

    JButton backBtn() {
        JButton b = new JButton("⬅ Back to Dashboard");
        b.addActionListener(e -> { dispose(); new DashboardFrame(); });
        return b;
    }
}