package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MapsPanel extends JPanel {
    MapNames polusMap;
    MapNames skeldMap;
    MapNames mirahMap;
    MapNames airshipMap;

    public MapsPanel(int width, JLabel mapsDisplayLabel) {
        this.setAlignmentY(30);
        mirahMap = new MapNames("Mirah", mapsDisplayLabel);
        skeldMap = new MapNames("Skeld", mapsDisplayLabel);
        polusMap = new MapNames("Polus", mapsDisplayLabel);
        airshipMap = new MapNames("Airship", mapsDisplayLabel);
        this.setLayout(new FlowLayout(FlowLayout.TRAILING, 0, 10));
        this.add(airshipMap);
        this.add(polusMap);
        this.add(skeldMap);
        this.add(mirahMap);
        this.setOpaque(false);
    }


}
