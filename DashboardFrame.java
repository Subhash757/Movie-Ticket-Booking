package Movie;

import javax.swing.*;
import java.awt.*;

public class DashboardFrame extends JFrame {

    public DashboardFrame() {
        setTitle("Dashboard");
        setSize(600,420);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel header = new JPanel();
        header.setBackground(new Color(180,235,200));
        JLabel welcome = new JLabel("Welcome, " + UsserSession.username);
        welcome.setFont(new Font("Arial", Font.BOLD, 22));
        header.add(welcome);
        add(header, BorderLayout.NORTH);

        JPanel grid = new JPanel(new GridLayout(2,2,20,20));
        grid.setBackground(new Color(220,245,230));
        grid.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));

        JButton movies = createBtn("🎬 Movies");
        JButton history = createBtn("🧾 History");
        JButton profile = createBtn("👤 Profile");
        JButton exit = createBtn("🚪 Logout");

        grid.add(movies);
        grid.add(history);
        grid.add(profile);
        grid.add(exit);

        add(grid, BorderLayout.CENTER);

        movies.addActionListener(e -> { dispose(); new HomeFrame(); });
        history.addActionListener(e -> { dispose(); new HistoryFrame(); });
        profile.addActionListener(e -> { dispose(); new ProfileFrame(); });
        exit.addActionListener(e -> { dispose(); new LoginFrame(); });

        setVisible(true);
    }

    JButton createBtn(String text) {
        JButton b = new JButton(text);
        b.setFont(new Font("Arial", Font.BOLD, 16));
        b.setBackground(new Color(120,200,150));
        b.setForeground(Color.WHITE);
        return b;
    }
}