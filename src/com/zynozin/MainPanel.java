package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

public class MainPanel extends JLayeredPane {
    MapsPicker mapsPicker;
    MapDisplay mapDisplay;
    DragPanel dragPanel;


    public MainPanel(int width, int height) {
        mapDisplay = new MapDisplay(width);
        mapsPicker = new MapsPicker(width, mapDisplay.mapsDisplayLabel);
        dragPanel = new DragPanel();
        this.setLayout(new BorderLayout());
        this.add(dragPanel);
        this.add(mapDisplay);
        this.add(mapsPicker, BorderLayout.NORTH);


        this.setBounds(0, 40, width, height);
        this.setPreferredSize(new Dimension(width, height));
        this.setOpaque(false);
        this.setBackground(new Color(0, 0, 0, 100));
    }


}
