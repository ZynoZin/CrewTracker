package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CommandLabel extends JLabel implements MouseListener {
    private String title;
    private Character[] characters;
    private DragPanel dragPanel;
    private MainPanel mainPanel;
    private JFrame frame;
    private final int WIDTH = 1200;
    private final int HEIGHT = 900;


    public CommandLabel(String title, Character[] characters, JFrame frame, MainPanel mainPanel) {
        this.title = title;
        this.frame = frame;
        this.characters = characters;
        this.mainPanel = mainPanel;
        this.setText(title);
        this.setFont(new Font("Pink Chicken", Font.PLAIN, 20));
        this.setForeground(Color.white);
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(150, 60));
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.addMouseListener(this);
        this.setBorder(BorderFactory.createLineBorder(new Color(230, 179, 255), 5));
        this.setBackground(new Color(213, 128, 255));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Character character : this.characters)
            character.imageIcon.paintIcon(this.dragPanel, g, (int) character.imageCorner.getX(), (int) character.imageCorner.getY());
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (this.title == "Reset Positions") {
            this.mainPanel.setVisible(false);
            MainPanel mainPanel = new MainPanel(WIDTH, HEIGHT - 200);
            this.mainPanel = mainPanel;
            this.frame.add(this.mainPanel, BorderLayout.CENTER);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBackground(new Color(245, 204, 255));

    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(new Color(213, 128, 255));
    }
}
