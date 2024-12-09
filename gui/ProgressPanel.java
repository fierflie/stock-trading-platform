// ProgressPanel.java
// A simple panel to display progress.

package gui;

import javax.swing.*;
import java.awt.*;

public class ProgressPanel extends JPanel {
    public ProgressPanel() {
        setLayout(new BorderLayout());

        // Add a label
        JLabel label = new JLabel("Progress Tracker", JLabel.CENTER);
        add(label, BorderLayout.NORTH);

        // Add a progress bar
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(50);
        add(progressBar, BorderLayout.CENTER);
    }
}
