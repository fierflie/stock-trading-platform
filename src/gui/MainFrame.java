// MainFrame.java
// The main GUI frame for the application.

package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        // Set up the main frame
        setTitle("ProgressTracker GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add components
        ProgressPanel progressPanel = new ProgressPanel();
        add(progressPanel, BorderLayout.CENTER);
    }
}
