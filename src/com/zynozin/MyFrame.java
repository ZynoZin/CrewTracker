package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

public class MyFrame extends JFrame {
    private final int WIDTH = 1200;
    private final int HEIGHT = 1000;
    private FrameDragListener frameDragListener = new FrameDragListener(this);
    private MainPanel mainPanel = new MainPanel(WIDTH, 965);
    private BarPanel barPanel = new BarPanel(this, this.mainPanel);
    private ImageIcon mainIcon = new ImageIcon("images/mainIconBar.png");
    private Image image = mainIcon.getImage();
    private Image mainImage = image.getScaledInstance(500, 500, Image.SCALE_SMOOTH);

    public MyFrame() {
        this.addMouseListener(frameDragListener);
        this.addMouseMotionListener(frameDragListener);
        this.add(barPanel, BorderLayout.NORTH);
        this.add(mainPanel);
        this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 100));
        this.setSize(WIDTH, HEIGHT);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setIconImage(mainImage);

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
