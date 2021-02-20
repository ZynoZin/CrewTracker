package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MapNames extends JLabel implements MouseListener {
    private String title;


    public MapNames(String title) {
        this.title = title;
        this.setText(title);
        this.setFont(new Font("Pink Chicken", Font.PLAIN, 35));
        this.setForeground(Color.white);
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(100, 60));
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setBorder(BorderFactory.createLineBorder(new Color(230, 179, 255), 5));
        this.setBackground(new Color(213, 128, 255));
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
      
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
