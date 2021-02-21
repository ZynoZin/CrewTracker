package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MapNames extends JLabel implements MouseListener {
    private String title;
    public JLabel mapDisplay;
    private ImageIcon skeldIcon = new ImageIcon("images/skeldMap.png");
    private ImageIcon polusIcon = new ImageIcon("images/polusMap.png");
    private ImageIcon mirahIcon = new ImageIcon("images/mirahMap.png");

    public MapNames(String title, JLabel mapDisplay) {
        this.title = title;
        this.setText(title);
        this.mapDisplay = mapDisplay;
        this.mapDisplay.setVisible(true);
        this.setFont(new Font("Pink Chicken", Font.PLAIN, 35));
        this.setForeground(Color.white);
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(100, 60));
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.addMouseListener(this);
        this.setBorder(BorderFactory.createLineBorder(new Color(230, 179, 255), 5));
        this.setBackground(new Color(213, 128, 255));
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.setBackground(new Color(143, 0, 179));
        if (this.title == "Skeld") {
            this.mapDisplay.setVisible(true);
            this.mapDisplay.setIcon(skeldIcon);

        } else if (this.title == "Polus") {
            this.mapDisplay.setVisible(true);
            this.mapDisplay.setIcon(polusIcon);
        } else if (this.title == "Mirah") {
            this.mapDisplay.setVisible(true);
            this.mapDisplay.setIcon(mirahIcon);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBackground(new Color(245, 204, 255));

    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(new Color(213, 128, 255));
    }
}
