package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class MapsPanel extends JPanel {
    MapNames polusMap = new MapNames("Polus");
    MapNames skeldMap = new MapNames("Skeld");
    MapNames mirahMap = new MapNames("Mirah");

    public MapsPanel() {
        this.setAlignmentY(30);
        this.setLayout(new FlowLayout(FlowLayout.TRAILING, 0, 15));
        this.add(polusMap);
        this.add(skeldMap);
        this.add(mirahMap);
        this.setOpaque(false);
    }
}
