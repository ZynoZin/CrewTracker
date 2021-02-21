package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class NotesArea extends JTextArea {
    ModernScrollPane modernScrollPane;

    public NotesArea() {
        this.setText("Write your Notes...");
        this.setLineWrap(true);
        this.setPreferredSize(new Dimension(750, 50000));
        this.setBounds(10, 750, 750, 170);
        this.setWrapStyleWord(true);
        this.setForeground(Color.white);
        this.setFont(new Font("Pink Chicken", Font.BOLD, 30));
        this.setBackground(new Color(31, 0, 77));
        this.setCaretColor(Color.white);
    }
}
