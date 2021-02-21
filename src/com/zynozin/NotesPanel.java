package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class NotesPanel extends JPanel {
    public NotesArea notesArea;

    public NotesPanel() {
        notesArea = new NotesArea();
        this.setPreferredSize(new Dimension(800, 5000));
        this.setBackground(new Color(31, 0, 77));
        this.add(notesArea);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        this.setBorder(BorderFactory.createLineBorder(new Color(230, 179, 255), 10));

    }
}
