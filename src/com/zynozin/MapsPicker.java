package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class MapsPicker extends JPanel {
    final int PICKER_HEIGHT = 70;

    MapsPanel mapsPanel;
    MapsTitle mapsTitle;

    public MapsPicker(int width) {
        mapsPanel = new MapsPanel();
        mapsTitle = new MapsTitle();
        this.setLayout(new BorderLayout());
        this.setOpaque(false);
        this.add(mapsPanel, BorderLayout.EAST);
        this.add(mapsTitle, BorderLayout.WEST);
        this.setPreferredSize(new Dimension(width, PICKER_HEIGHT));
    }
}
