package Movie;

import javax.swing.*;
import java.awt.*;

public class MovieFrame extends JFrame {

    public MovieFrame() {
        setTitle("Show Timings");
        setSize(400,300);
        setLayout(new GridLayout(5,1));

        add(new JLabel("Movie: " + UsserSession.movie, JLabel.CENTER));

        JButton t1 = new JButton("10:00 AM");
        JButton t2 = new JButton("3:00 PM");
        JButton t3 = new JButton("9:00 PM");
        JButton t4 = new JButton("12:00 AM");

        add(t1); add(t2); add(t3);add(t4);
        add(backBtn());

        t1.addActionListener(e -> next());
        t2.addActionListener(e -> next());
        t3.addActionListener(e -> next());
        t4.addActionListener(e -> next());

        setVisible(true);
    }

    void next() {
        dispose();
        new SeatTypeFrame();
    }

    JButton backBtn() {
        JButton b = new JButton("⬅ Back to Dashboard");
        b.addActionListener(e -> { dispose(); new DashboardFrame(); });
        return b;
    }
}