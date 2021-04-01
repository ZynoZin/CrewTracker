package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class NotesArea extends JTextArea {
    ModernScrollPane modernScrollPane;
    private Font font = Main.getFontforApp(35f);

    public NotesArea() {
        this.setText("Write your Notes...");
        this.setLineWrap(true);
        this.setPreferredSize(new Dimension(750, 50000));
        this.setBounds(10, 750, 750, 170);
        this.setWrapStyleWord(true);
        this.setForeground(Color.white);
        this.setFont(font);
        this.setBackground(new Color(20, 20, 20));
        this.setCaretColor(Color.white);
    }
}
