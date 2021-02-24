package com.zynozin;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }

    public static Font getFontforApp(float size) {
        Font font = null;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/PinkChicken.ttf")).deriveFont(size);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts/pinkChiken.ttf")));
        } catch (IOException | FontFormatException e) {

        }
        return font;
    }
}
