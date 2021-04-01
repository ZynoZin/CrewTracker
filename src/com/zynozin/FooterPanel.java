package com.zynozin;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class FooterPanel extends JPanel {
    private final int HEIGHT = 200;
    public CommandPanel commandPanel;
    private NotesPanel notesPanel;
    private JPanel panel;
    private Font font = Main.getFontforApp(20f);
    private JLabel copyright;

    public FooterPanel(int width, JFrame frame, MainPanel mainPanel) {
        notesPanel = new NotesPanel();
        panel = new JPanel();
        commandPanel = new CommandPanel(HEIGHT - 100, frame, mainPanel, notesPanel.notesArea);
        copyright = new JLabel("Created by ZynoZin");
        panel.setPreferredSize(new Dimension(400, HEIGHT));
        panel.setOpaque(false);
        panel.setLayout(new BorderLayout());
        copyright.setFont(font);
        copyright.setOpaque(false);
        copyright.setForeground(Color.lightGray);
        copyright.setBorder(new EmptyBorder(0, 250, 0, 0));
        panel.add(commandPanel, BorderLayout.NORTH);
        panel.add(copyright, BorderLayout.SOUTH);
        ModernScrollPane modernScrollPane = new ModernScrollPane(notesPanel);
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(width, HEIGHT));
        this.add(panel, BorderLayout.EAST);
        this.add(modernScrollPane, BorderLayout.WEST);
        this.setOpaque(false);

    }
}
