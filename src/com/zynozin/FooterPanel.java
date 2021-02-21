package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class FooterPanel extends JPanel {
    private final int HEIGHT = 200;
    public CommandPanel commandPanel;
    private NotesPanel notesPanel;

    public FooterPanel(int width, JFrame frame, MainPanel mainPanel) {
        notesPanel = new NotesPanel();
        ModernScrollPane modernScrollPane = new ModernScrollPane(notesPanel);
        commandPanel = new CommandPanel(HEIGHT, frame, mainPanel, notesPanel.notesArea);
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(width, HEIGHT));

        this.add(commandPanel, BorderLayout.EAST);
        this.add(modernScrollPane, BorderLayout.WEST);
        this.setOpaque(false);

    }
}
