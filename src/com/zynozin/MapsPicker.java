package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class MapsPicker extends JPanel {
    final int PICKER_HEIGHT = 70;

    MapsPanel mapsPanel;
    JLabel chooseYourMap;
    private Font font = Main.getFontforApp(60f);

    public MapsPicker(int width, JLabel mapsDisplayLabel) {
        mapsPanel = new MapsPanel(width, mapsDisplayLabel);
        chooseYourMap = mapsPickerTite();
        this.setLayout(new BorderLayout());
        this.setOpaque(false);
        this.add(mapsPanel, BorderLayout.EAST);
        this.add(chooseYourMap, BorderLayout.WEST);
        this.setPreferredSize(new Dimension(width, PICKER_HEIGHT));
    }

    private JLabel mapsPickerTite() {
        JLabel label = new JLabel();
        label.setText("Choose a Map:");
        label.setForeground(new Color(255, 255, 255));
        label.setOpaque(false);
        label.setFont(font);
        label.setPreferredSize(new Dimension(400, 60));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        return label;
    }
}
