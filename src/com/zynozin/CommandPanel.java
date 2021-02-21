package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CommandPanel extends JPanel {
    public CommandLabel resetPositions;
    private CommandLabel clearNotes;

    public CommandPanel(int height, JFrame frame, MainPanel mainPanel, NotesArea notesArea) {
        resetPositions = new CommandLabel("Reset Positions", frame, mainPanel, notesArea);
        clearNotes = new CommandLabel("Clear Notes", frame, mainPanel, notesArea);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        this.setPreferredSize(new Dimension(400, height));
        this.add(clearNotes);
        this.add(resetPositions);
        this.setOpaque(false);
    }
}
