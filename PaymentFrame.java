package Movie;

import javax.swing.*;
import java.awt.*;

public class PaymentFrame extends JFrame {

    public PaymentFrame() {
        setTitle("Payment");
        setSize(400,200);
        setLayout(new GridLayout(4,1));

        add(new JLabel("Total Amount: ₹" + UsserSession.totalAmount, JLabel.CENTER));
        JButton pay = new JButton("PAY NOW");

        add(pay);
        add(new JLabel());
        add(backBtn());

        pay.addActionListener(e -> {
            UsserSession.history.add(UsserSession.movie + " - ₹" + UsserSession.totalAmount);
            dispose();
            new HistoryFrame();
        });

        setVisible(true);
    }

    JButton backBtn() {
        JButton b = new JButton("⬅ Back to Dashboard");
        b.addActionListener(e -> { dispose(); new DashboardFrame(); });
        return b;
    }
}