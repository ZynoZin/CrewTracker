package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class CommandBarPanel extends JPanel {
    private CloseLabel closeLabel;
    private HideLabel hideLabel;
    private JFrame frame;
    private MainPanel mainPanel;
    public static VolumeLabel volumeLabel = new VolumeLabel();

    public CommandBarPanel(JFrame frame, MainPanel mainPanel, JPanel footerPanel) {
        this.frame = frame;
        this.mainPanel = mainPanel;
        closeLabel = new CloseLabel(this.frame, volumeLabel);
        hideLabel = new HideLabel(this.mainPanel, this.frame, footerPanel, volumeLabel);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        this.setBackground(new Color(41, 41, 41));
        this.add(hideLabel);
        this.add(volumeLabel);
        this.add(closeLabel);

        this.setAlignmentX(CENTER_ALIGNMENT);
    }
}
