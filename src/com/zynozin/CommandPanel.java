package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CommandPanel extends JPanel {
    private CommandLabel resetPositions;
    private CommandLabel clearNotes;

    public CommandPanel(int height, Character[] characters, JFrame frame, MainPanel mainPanel) {
        resetPositions = new CommandLabel("Reset Positions", characters, frame, mainPanel);
        clearNotes = new CommandLabel("Clear Notes", characters, frame, mainPanel);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        this.setPreferredSize(new Dimension(400, height));
        this.add(clearNotes);
        this.add(resetPositions);
        this.setOpaque(false);
    }
}
