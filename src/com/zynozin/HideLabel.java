package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HideLabel extends JLabel implements MouseListener {
    private JLayeredPane mainPanel;
    public JFrame frame;
    private ImageIcon hideIcon = new ImageIcon("images/resize.png");
    private ImageIcon unHideIcon = new ImageIcon("images/unhide.png");
    private Boolean isHidden = false;

    public HideLabel(JLayeredPane mainPanel, JFrame frame) {
        this.frame = frame;
        this.mainPanel = mainPanel;
        this.setIcon(getCommandIcon());
        this.addMouseListener(this);

    }

    private ImageIcon getCommandIcon() {
        ImageIcon icon;
        if (!this.isHidden)
            icon = hideIcon;
        else
            icon = unHideIcon;
        return icon;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (!this.isHidden) {
            mainPanel.setVisible(false);
            this.frame.setBackground(new Color(0, 0, 0, 0));
            this.isHidden = true;
            this.setIcon(getCommandIcon());
        } else {
            mainPanel.setVisible(true);
            this.frame.setBackground(new Color(0, 0, 0, 100));
            this.isHidden = false;
            this.setIcon(getCommandIcon());
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setOpaque(true);
        this.setBackground(Color.LIGHT_GRAY);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(new Color(0, 0, 0));
    }
}

