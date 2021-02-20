package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    Character character;

    DragPanel() {
        character = new Character();
        ClickListener clickListener = new ClickListener();
        DragLisetener dragLisetener = new DragLisetener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragLisetener);
        this.setBounds(0, 105, 1200, 800);
        this.setOpaque(false);
        
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        character.imageIcon.paintIcon(this, g, (int) character.imageCorner.getX(), (int) character.imageCorner.getY());


    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            character.prevPoint = e.getPoint();
            System.out.println("pls pls pls ");
        }
    }

    private class DragLisetener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {

            Point currentPoint = e.getPoint();
            character.imageCorner.translate(
                    currentPoint.x - character.prevPoint.x,
                    currentPoint.y - character.prevPoint.y
            );
            character.prevPoint = currentPoint;
            repaint();
        }
    }

}
