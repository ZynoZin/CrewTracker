package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class TitleLabel extends JLabel {
    private ImageIcon mainIconBar = new ImageIcon("images/mainIconBar.png");
    private Font font = Main.getFontforApp(25f);

    public TitleLabel() {
        this.setText("Crew Tracker");
        this.setForeground(new Color(255, 255, 255));
        this.setFont(font);
        this.setIcon(mainIconBar);
    }
}
