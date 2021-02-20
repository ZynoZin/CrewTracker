package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class CommandBarPanel extends JPanel {
    private CloseLabel closeLabel;
    private HideLabel hideLabel;
    private JFrame frame;
    private JPanel mainPanel;

    public CommandBarPanel(JFrame frame, JPanel mainPanel) {
        this.frame = frame;
        this.mainPanel = mainPanel;
        closeLabel = new CloseLabel(this.frame);
        hideLabel = new HideLabel(this.mainPanel);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        this.setBackground(new Color(132, 0, 255));
        this.add(hideLabel);
        this.add(closeLabel);
        this.setAlignmentX(CENTER_ALIGNMENT);
    }
}
