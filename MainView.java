import javax.swing.*;

public class MainView {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Stock Trading Platform");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add components
        JLabel welcomeLabel = new JLabel("Welcome to the Stock Trading Platform!");
        welcomeLabel.setBounds(20, 20, 300, 20);
        frame.add(welcomeLabel);

        // Layout settings
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
