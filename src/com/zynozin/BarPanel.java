package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BarPanel extends JPanel {
    private CommandBarPanel commandBarPanel;
    private TitleLabel titleLabel;

    public BarPanel(JFrame frame, JPanel mainPanel) {
        commandBarPanel = new CommandBarPanel(frame, mainPanel);
        titleLabel = new TitleLabel();
        this.setLayout(new BorderLayout());
        this.add(commandBarPanel, BorderLayout.EAST);
        this.add(titleLabel, BorderLayout.WEST);
        this.setPreferredSize(new Dimension(WIDTH, 35));
        this.setBackground(new Color(132, 0, 255));
    }


}
