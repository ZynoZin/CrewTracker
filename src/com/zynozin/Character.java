package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Character extends JLabel {
    public ImageIcon imageIcon;

    public Point imageCorner;
    public Point prevPoint;
    private int x;
    private int y;

    public Character(int x, int y, String imageDirectory) {
        this.x = x;
        this.y = y;
        this.imageIcon = new ImageIcon(imageDirectory);
        imageCorner = new Point(x, y);
        this.prevPoint = imageCorner;
        this.setBounds(x, y, 48, 48);
        this.setIcon(imageIcon);
        this.setOpaque(false);
        this.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public void resetPosition() {
        this.imageCorner.x = this.x;
        this.imageCorner.y = this.y;
    }

}
