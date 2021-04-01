package com.zynozin;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

public class MapNames extends JLabel implements MouseListener {
    private String title;
    public JLabel mapDisplay;
    private ImageIcon skeldIcon = new ImageIcon("images/skeldMap.png");
    private ImageIcon polusIcon = new ImageIcon("images/polusMap.png");
    private ImageIcon mirahIcon = new ImageIcon("images/mirahMap.png");
    private ImageIcon airshipIcon = new ImageIcon("images/airship.png");
    private AudioProvider audioProvider = new AudioProvider();
    private Font font = Main.getFontforApp(35f);

    public MapNames(String title, JLabel mapDisplay) {
        this.title = title;
        this.setText(title);
        this.mapDisplay = mapDisplay;
        this.mapDisplay.setVisible(true);
        this.setFont(font);
        this.setForeground(Color.white);
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(100, 60));
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.addMouseListener(this);
        this.setBorder(BorderFactory.createLineBorder(new Color(92, 92, 92), 5));
        this.setBackground(new Color(41, 41, 41));
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.setBackground(new Color(0, 0, 0));
        if (CommandBarPanel.volumeLabel.isMuted == false) {
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
        if (this.title.equals("Skeld")) {
            this.mapDisplay.setVisible(true);
            this.mapDisplay.setIcon(skeldIcon);

        } else if (this.title.equals("Polus")) {
            this.mapDisplay.setVisible(true);
            this.mapDisplay.setIcon(polusIcon);
        } else if (this.title.equals("Mirah")) {
            this.mapDisplay.setVisible(true);
            this.mapDisplay.setIcon(mirahIcon);
        } else if (this.title.equals("Airship")) {
            this.mapDisplay.setVisible(true);
            this.mapDisplay.setIcon(airshipIcon);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBackground(new Color(75, 75, 75));
        if (CommandBarPanel.volumeLabel.isMuted == false) {
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
