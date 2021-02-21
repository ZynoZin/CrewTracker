package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CloseLabel extends JLabel implements MouseListener {
    private JFrame frame;
    private ImageIcon closeIcon = new ImageIcon("images/close.png");

    public CloseLabel(JFrame frame) {
        this.frame = frame;
        this.setIcon(closeIcon);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.dispose();
        System.exit(0);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setOpaque(true);
        this.setBackground(Color.RED);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(new Color(77, 0, 153));
    }
}
