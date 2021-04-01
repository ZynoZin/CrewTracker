package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

public class MyFrame extends JFrame {
    private final int WIDTH = 1200;
    private final int HEIGHT = 900;
    private FrameDragListener frameDragListener = new FrameDragListener(this);
    private MainPanel mainPanel = new MainPanel(WIDTH, HEIGHT - 200);
    private ImageIcon mainIcon = new ImageIcon("images/mainIconBar.png");
    private Image image = mainIcon.getImage();
    private Image mainImage = image.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
    private FooterPanel footerPanel = new FooterPanel(WIDTH, this, mainPanel);
    public BarPanel barPanel = new BarPanel(this, footerPanel.commandPanel.resetPositions.mainPanel, this.footerPanel);

    public MyFrame() {
        footerPanel.commandPanel.resetPositions.setVolumeLabel(barPanel.commandBarPanel.volumeLabel);
        mainPanel = CommandLabel.mainPanel;
        footerPanel.commandPanel.clearNotes.setVolumeLabel(barPanel.commandBarPanel.volumeLabel);
        this.addMouseListener(frameDragListener);
        this.addMouseMotionListener(frameDragListener);
        this.setLayout(new BorderLayout());
        this.add(barPanel, BorderLayout.NORTH);
        this.add(mainPanel, BorderLayout.CENTER);
        this.add(footerPanel, BorderLayout.SOUTH);
        this.setUndecorated(true);
        this.getRootPane().setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        this.setBackground(new Color(41, 41, 41, 100));
        this.setSize(WIDTH, HEIGHT);
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        this.setVisible(true);
        this.setAlwaysOnTop(true);
        this.setIconImage(mainImage);
        this.pack();

    }

    private class FrameDragListener extends MouseAdapter {

        private final JFrame frame;
        private Point mouseDownCompCoords = null;

        public FrameDragListener(JFrame frame) {
            this.frame = frame;
        }

        public void mouseReleased(MouseEvent e) {
            mouseDownCompCoords = null;
        }

        public void mousePressed(MouseEvent e) {
            mouseDownCompCoords = e.getPoint();
        }

        public void mouseDragged(MouseEvent e) {
            if (mouseDownCompCoords.x >= 0 && mouseDownCompCoords.x <= WIDTH) {
                if (mouseDownCompCoords.y >= 0 && mouseDownCompCoords.y <= 35) {
                    Point currCoords = e.getLocationOnScreen();
                    frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
                }
            }

        }
    }


}
