package Movie;

import javax.swing.*;
import java.awt.*;

public class SeatTypeFrame extends JFrame {

    public SeatTypeFrame() {
        setTitle("Seat Type");
        setSize(400,300);
        setLayout(new GridLayout(5,1));

        JButton silver = new JButton("Silver ₹150");
        JButton gold = new JButton("Gold ₹250");
        JButton recliner = new JButton("Recliner ₹400");

        add(new JLabel("Choose Seat Type", JLabel.CENTER));
        add(silver); add(gold); add(recliner);
        add(backBtn());

        silver.addActionListener(e -> select(150));
        gold.addActionListener(e -> select(250));
        recliner.addActionListener(e -> select(400));

        setVisible(true);
    }

    void select(int price) {
        UsserSession.totalAmount = price;
        dispose();
        new SeatsSelectionFrame();
    }

    JButton backBtn() {
        JButton b = new JButton("⬅ Back to Dashboard");
        b.addActionListener(e -> { dispose(); new DashboardFrame(); });
        return b;
    }
}