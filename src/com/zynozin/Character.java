package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Character extends JLabel {
    public ImageIcon imageIcon = new ImageIcon("images/red.png");
    final int WIDTH = imageIcon.getIconWidth();
    final int HEIGHT = imageIcon.getIconWidth();
    public Point imageCorner;
    public Point prevPoint;

    public Character() {
        imageCorner = new Point(10, 610);


        this.setIcon(imageIcon);
        this.setOpaque(false);
        this.setHorizontalAlignment(SwingConstants.CENTER);

    }


}
