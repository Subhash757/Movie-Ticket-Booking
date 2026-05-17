package Movie;

import javax.swing.*;
import java.awt.*;

public class HistoryFrame extends JFrame {

    public HistoryFrame() {
        setTitle("Booking History");
        setSize(450,350);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Your Booking History", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);

        JTextArea area = new JTextArea();
        area.setEditable(false);          // ✅ IMPORTANT (Notepad issue fixed)
        area.setFont(new Font("Arial", Font.PLAIN, 14));

        if (UsserSession.history.isEmpty()) {
            area.setText("No bookings yet.");
        } else {
            for (String h : UsserSession.history) {
                area.append(h + "\n");
            }
        }

        add(new JScrollPane(area), BorderLayout.CENTER);

        JButton back = new JButton("⬅ Back to Dashboard");
        back.addActionListener(e -> {
            dispose();
            new DashboardFrame();
        });

        add(back, BorderLayout.SOUTH);

        setVisible(true);
    }
}
