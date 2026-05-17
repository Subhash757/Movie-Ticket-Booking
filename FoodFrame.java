package Movie;

import javax.swing.*;
import java.awt.*;

public class FoodFrame extends JFrame {

    public FoodFrame() {
        setTitle("Food Add-ons");
        setSize(400,250);
        setLayout(new GridLayout(5,1));

        JCheckBox pop = new JCheckBox("Popcorn ₹120");
        JCheckBox coke = new JCheckBox("Coke ₹80");
        JButton next = new JButton("Proceed");

        add(pop); add(coke);
        add(next);
        add(new JLabel());
        add(backBtn());

        next.addActionListener(e -> {
            if(pop.isSelected()) UsserSession.totalAmount += 120;
            if(coke.isSelected()) UsserSession.totalAmount += 80;
            dispose();
            new PaymentFrame();
        });

        setVisible(true);
    }

    JButton backBtn() {
        JButton b = new JButton("⬅ Back to Dashboard");
        b.addActionListener(e -> { dispose(); new DashboardFrame(); });
        return b;
    }
}