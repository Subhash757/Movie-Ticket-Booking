package Movie;

import javax.swing.*;
import java.awt.*;

public class SeatsSelectionFrame extends JFrame {

    public SeatsSelectionFrame() {
        setTitle("Seats");
        setSize(400,250);
        setLayout(new GridLayout(5,1));

        JTextField seats = new JTextField();
        JButton next = new JButton("Next");

        add(new JLabel("Enter Seats"));
        add(seats);
        add(next);
        add(new JLabel());
        add(backBtn());

        next.addActionListener(e -> {
            UsserSession.seats = Integer.parseInt(seats.getText());
            UsserSession.totalAmount *= UsserSession.seats;
            dispose();
            new FoodFrame();
        });

        setVisible(true);

    }

    JButton backBtn() {
        JButton b = new JButton("⬅ Back to Dashboard");
        b.addActionListener(e -> { dispose(); new DashboardFrame(); });
        return b;
    }
}