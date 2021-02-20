package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class CommandBarPanel extends JPanel {
    private CloseLabel closeLabel;
    private HideLabel hideLabel;
    private JFrame frame;
    private JLayeredPane mainPanel;

    public CommandBarPanel(JFrame frame, JLayeredPane mainPanel) {
        this.frame = frame;
        this.mainPanel = mainPanel;
        closeLabel = new CloseLabel(this.frame);
        hideLabel = new HideLabel(this.mainPanel, this.frame);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        this.setBackground(new Color(0, 0, 0));
        this.add(hideLabel);
        this.add(closeLabel);
        this.setAlignmentX(CENTER_ALIGNMENT);
    }
}
