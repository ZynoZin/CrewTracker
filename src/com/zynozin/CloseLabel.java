package com.zynozin;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class CloseLabel extends JLabel implements MouseListener {
    private JFrame frame;
    private ImageIcon closeIcon = new ImageIcon("images/close.png");
    private AudioProvider audioProvider = new AudioProvider();
    private VolumeLabel volumeLabel;

    public CloseLabel(JFrame frame, VolumeLabel volumeLabel) {
        this.frame = frame;
        this.volumeLabel = volumeLabel;
        this.setIcon(closeIcon);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.dispose();
        System.exit(0);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setOpaque(true);
        this.setBackground(Color.RED);
        if (this.volumeLabel.isMuted == false)
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

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(new Color(41, 41, 41));
    }
}
