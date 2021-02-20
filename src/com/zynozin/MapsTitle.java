package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class MapsTitle extends JLabel {
    
    public MapsTitle() {
        this.setText("Choose a Map:");
        this.setForeground(new Color(230, 179, 255));
        this.setOpaque(false);
        this.setFont(new Font("Pink Chicken", Font.BOLD, 60));
        this.setPreferredSize(new Dimension(400, 60));
        this.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
