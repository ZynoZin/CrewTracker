package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class NotesPanel extends JPanel {
    public NotesArea notesArea;

    public NotesPanel() {
        notesArea = new NotesArea();
        this.setPreferredSize(new Dimension(800, 5000));
        this.setBackground(new Color(30, 30, 30));
        this.add(notesArea);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        this.setBorder(BorderFactory.createLineBorder(new Color(90, 90, 90), 10));

    }
}
