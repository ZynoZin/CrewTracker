package com.zynozin;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class HideLabel extends JLabel implements MouseListener {
    private MainPanel mainPanel;
    public JFrame frame;
    private ImageIcon hideIcon = new ImageIcon("images/resize.png");
    private ImageIcon unHideIcon = new ImageIcon("images/unhide.png");
    private Boolean isHidden = false;
    private JPanel footerPanel;
    private AudioProvider audioProvider = new AudioProvider();
    private VolumeLabel volumeLabel;

    public HideLabel(MainPanel mainPanel, JFrame frame, JPanel footerPanel, VolumeLabel volumeLabel) {
        this.frame = frame;
        this.footerPanel = footerPanel;
        this.mainPanel = mainPanel;
        this.volumeLabel = volumeLabel;
        this.setIcon(getCommandIcon());
        this.addMouseListener(this);

    }

    public void setMainPanel(MainPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    private ImageIcon getCommandIcon() {
        ImageIcon icon;
        if (!this.isHidden)
            icon = hideIcon;
        else
            icon = unHideIcon;
        return icon;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (!this.isHidden) {
            setMainPanel(CommandLabel.mainPanel);
            this.mainPanel.setVisible(false);
            this.footerPanel.setVisible(false);
            this.frame.setBackground(new Color(140, 26, 255, 0));
            this.isHidden = true;
            this.setIcon(getCommandIcon());
        } else {
            this.mainPanel.setVisible(true);
            this.footerPanel.setVisible(true);
            this.frame.setBackground(new Color(140, 26, 255, 100));
            this.isHidden = false;
            this.setIcon(getCommandIcon());
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
        this.setOpaque(true);
        this.setBackground(new Color(179, 128, 255));
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
        this.setBackground(new Color(77, 0, 153));
    }
}

