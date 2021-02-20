package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class TitleLabel extends JLabel {
    private ImageIcon mainIconBar = new ImageIcon("images/mainIconBar.png");

    public TitleLabel() {
        this.setText("Crew Tracker");
        this.setForeground(new Color(255, 255, 255));
        this.setFont(new Font("Pink Chicken", Font.PLAIN, 25));
        this.setIcon(mainIconBar);
    }
}
