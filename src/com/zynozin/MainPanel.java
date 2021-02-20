package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    MapsPicker mapsPicker;
   
    public MainPanel(int width, int height) {
        mapsPicker = new MapsPicker(width);
        this.setLayout(new BorderLayout());
        this.add(mapsPicker, BorderLayout.NORTH);
        this.setBounds(0, 40, width, height);
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(new Color(179, 102, 255, 50));
    }
}
