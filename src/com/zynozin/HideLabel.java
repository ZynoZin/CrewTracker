package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HideLabel extends JLabel implements MouseListener {
    private JPanel mainPanel;
    private ImageIcon hideIcon = new ImageIcon("images/resize.png");
    private ImageIcon unHideIcon = new ImageIcon("images/unhide.png");
    private Boolean isHidden = false;

    public HideLabel(JPanel mainPanel) {
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
            this.isHidden = true;
            this.setIcon(getCommandIcon());
        } else {
            mainPanel.setVisible(true);
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
        this.setBackground(new Color(209, 179, 255));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(new Color(132, 0, 255));
    }
}

