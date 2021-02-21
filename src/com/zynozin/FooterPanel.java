package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class FooterPanel extends JPanel {
    private final int HEIGHT = 200;
    private CommandPanel commandPanel;
    private NotesPanel notesPanel;

    public FooterPanel(int width, Character[] characters, JFrame frame, MainPanel mainPanel) {

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(width, HEIGHT));
        commandPanel = new CommandPanel(HEIGHT, characters, frame, mainPanel);
        notesPanel = new NotesPanel(HEIGHT);
        this.add(commandPanel, BorderLayout.EAST);
        this.add(notesPanel, BorderLayout.WEST);
        this.setOpaque(false);

    }
}
