package com.zynozin;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

public class CommandLabel extends JLabel implements MouseListener {
    private String title;
    private Character[] characters;
    private DragPanel dragPanel;
    public static MainPanel mainPanel;
    private JFrame frame;
    private final int WIDTH = 1200;
    private final int HEIGHT = 900;
    private NotesArea notesArea;
    private AudioProvider audioProvider = new AudioProvider();
    private VolumeLabel volumeLabel;
    private Font font = Main.getFontforApp(20f);

    public CommandLabel(String title, JFrame frame, MainPanel mainPanel, NotesArea notesArea) {
        this.notesArea = notesArea;
        this.title = title;
        this.frame = frame;
        this.mainPanel = mainPanel;
        this.volumeLabel = getVolumeLabel();
        this.setText(title);
        this.setFont(font);
        this.setForeground(Color.white);
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(150, 60));
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.addMouseListener(this);
        this.setBorder(BorderFactory.createLineBorder(new Color(92, 92, 92), 5));
        this.setBackground(new Color(41, 41, 41));

    }

    public static void setMainPanel(MainPanel mainPanel) {

        CommandLabel.mainPanel = mainPanel;
    }

    public void setVolumeLabel(VolumeLabel volumeLabel) {
        this.volumeLabel = volumeLabel;
    }

    public VolumeLabel getVolumeLabel() {
        return volumeLabel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.setBackground(new Color(0, 0, 0));
        if (this.title == "Reset Positions") {
            this.mainPanel.setVisible(false);
            MainPanel mainPanel = new MainPanel(WIDTH, HEIGHT - 200);
            setMainPanel(mainPanel);
            this.frame.add(this.mainPanel, BorderLayout.CENTER);
        } else if (this.title == "Clear Notes") {
            this.notesArea.setText("");
        }
        if (this.volumeLabel.isMuted == false) {
            try {
                audioProvider.makeSound("audio/select.wav");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                unsupportedAudioFileException.printStackTrace();
            } catch (LineUnavailableException lineUnavailableException) {
                lineUnavailableException.printStackTrace();
            }
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBackground(new Color(75, 75, 75));
        if (this.volumeLabel.isMuted == false) {
            try {
                audioProvider.makeSound("audio/scroll.wav");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                unsupportedAudioFileException.printStackTrace();
            } catch (LineUnavailableException lineUnavailableException) {
                lineUnavailableException.printStackTrace();
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(new Color(41, 41, 41));
    }
}
