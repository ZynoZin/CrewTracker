package com.zynozin;

import javax.print.attribute.standard.JobKOctets;
import javax.swing.*;
import javax.swing.plaf.basic.DefaultMenuLayout;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MapDisplay extends JLayeredPane {
    public JLabel mapsDisplayLabel;


    public MapDisplay(int width) {
        mapsDisplayLabel = new JLabel();
        mapsDisplayLabel.setPreferredSize(new Dimension(width, 600));
        mapsDisplayLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mapsDisplayLabel.setOpaque(false);
        this.setLayout(new BorderLayout());
        this.add(mapsDisplayLabel, BorderLayout.NORTH);
        this.setPreferredSize(new Dimension(width - 20, 795));
        this.setBounds(10, 105, width - 10, 895);
        this.setOpaque(false);

    }


}