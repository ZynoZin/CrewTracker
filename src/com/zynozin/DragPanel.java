package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    Character redCharacter = new Character(10, 570, "images/red.png");
    Character blackCharacter = new Character(60, 570, "images/black.png");
    Character whiteCharacter = new Character(110, 570, "images/white.png");
    Character greenCharacter = new Character(160, 570, "images/green.png");
    Character yellowCharacter = new Character(210, 570, "images/yellow.png");
    Character blueCharacter = new Character(260, 570, "images/blue.png");
    Character purpleCharacter = new Character(310, 570, "images/purple.png");
    Character cyanCharacter = new Character(360, 570, "images/cyan.png");
    Character limeCharacter = new Character(410, 570, "images/lime.png");
    Character orangeCharacter = new Character(460, 570, "images/orange.png");
    Character brownCharacter = new Character(510, 570, "images/brown.png");
    Character pinkCharacter = new Character(560, 570, "images/pink.png");
    public Character[] characters;

    public DragPanel(Character[] characters) {
        this.characters = reset();
        this.characters[0] = redCharacter;
        this.characters[1] = blackCharacter;
        this.characters[2] = whiteCharacter;
        this.characters[3] = yellowCharacter;
        this.characters[4] = greenCharacter;
        this.characters[5] = blueCharacter;
        this.characters[6] = pinkCharacter;
        this.characters[7] = purpleCharacter;
        this.characters[8] = cyanCharacter;
        this.characters[9] = limeCharacter;
        this.characters[10] = orangeCharacter;
        this.characters[11] = brownCharacter;
        ClickListener clickListener = new ClickListener();
        DragLisetener dragLisetener = new DragLisetener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragLisetener);
        this.setBounds(0, 90, 1400, 800);
        this.setOpaque(false);

    }

    public Character[] reset() {
        Character[] newCharacters = new Character[12];
        newCharacters[0] = redCharacter;
        newCharacters[1] = blackCharacter;
        newCharacters[2] = whiteCharacter;
        newCharacters[3] = yellowCharacter;
        newCharacters[4] = greenCharacter;
        newCharacters[5] = blueCharacter;
        newCharacters[6] = pinkCharacter;
        newCharacters[7] = purpleCharacter;
        newCharacters[8] = cyanCharacter;
        newCharacters[9] = limeCharacter;
        newCharacters[10] = orangeCharacter;
        newCharacters[11] = brownCharacter;
        return newCharacters;
    }

    /*
    public void initCharachters() {
        int count = 10;
        for (int i = 0; i < characters.length; i++) {
            characters[i] = new Character(count, 610);
            count = count + 50;
        }
    }
    */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Character character : characters)
            character.imageIcon.paintIcon(this, g, (int) character.imageCorner.getX(), (int) character.imageCorner.getY());

    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            for (Character character : characters) {
                character.prevPoint = e.getPoint();
            }
        }
    }

    private class DragLisetener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            for (Character character : characters) {
                if (character.prevPoint.x >= character.imageCorner.x && character.prevPoint.x <= character.imageCorner.x + 48) {
                    if (character.prevPoint.y >= character.imageCorner.y && character.prevPoint.y <= character.imageCorner.y + 48) {
                        Point currentPoint = e.getPoint();
                        character.imageCorner.translate(
                                currentPoint.x - character.prevPoint.x,
                                currentPoint.y - character.prevPoint.y
                        );
                        character.prevPoint = currentPoint;
                        if (character.imageCorner.x >= 0 && character.imageCorner.x <= 1350 && character.imageCorner.y >= 0 && character.imageCorner.y <= 570)
                            repaint();
                    }
                }

            }
        }

    }
}