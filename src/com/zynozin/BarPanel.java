package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BarPanel extends JPanel {
    public CommandBarPanel commandBarPanel;
    private TitleLabel titleLabel;

    public BarPanel(JFrame frame, MainPanel mainPanel, JPanel footerPanel) {
        commandBarPanel = new CommandBarPanel(frame, mainPanel, footerPanel);
        titleLabel = new TitleLabel();
        this.setLayout(new BorderLayout());
        this.add(commandBarPanel, BorderLayout.EAST);
        this.add(titleLabel, BorderLayout.WEST);
        this.setPreferredSize(new Dimension(WIDTH, 35));
        this.setBackground(new Color(77, 0, 153));
    }


}
