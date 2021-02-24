package com.zynozin;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class VolumeLabel extends JLabel implements MouseListener {
    private ImageIcon volumeUpIcon = new ImageIcon("images/volumeUp.png");
    private ImageIcon volumeDownIcon = new ImageIcon("images/volumeDown.png");
    private AudioProvider audioProvider = new AudioProvider();
    public Boolean isMuted = false;

    public VolumeLabel() {
        this.setIcon(getVolumeIcon());
        this.addMouseListener(this);
    }

    private ImageIcon getVolumeIcon() {
        ImageIcon icon;
        if (!isMuted)
            icon = volumeUpIcon;
        else
            icon = volumeDownIcon;
        return icon;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (!isMuted) {
            this.isMuted = true;
            this.setIcon(getVolumeIcon());
        } else {
            this.isMuted = false;
            this.setIcon(getVolumeIcon());
        }
    }


    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setOpaque(true);
        this.setBackground(new Color(179, 128, 255));
        if (this.isMuted == false) {
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
        this.setBackground(new Color(77, 0, 153));
    }
}

