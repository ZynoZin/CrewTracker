package com.zynozin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

public class MainPanel extends JLayeredPane {
    MapsPicker mapsPicker;
    MapDisplay mapDisplay;
    DragPanel dragPanel;

    public MainPanel(int width, int height) {
        mapDisplay = new MapDisplay(width);
        mapsPicker = new MapsPicker(width, mapDisplay.mapsDisplayLabel);
        dragPanel = new DragPanel(reset());
        this.setLayout(new BorderLayout());
        this.add(dragPanel);
        this.add(mapDisplay);
        this.add(mapsPicker, BorderLayout.NORTH);
        this.setBounds(0, 40, width, height);
        this.setPreferredSize(new Dimension(width, height));
        this.setOpaque(false);
        this.setBackground(new Color(0, 0, 0, 100));

    }


    public Character[] reset() {
        Character[] newCharacters = new Character[12];
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


}
