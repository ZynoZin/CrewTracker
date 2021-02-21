package com.zynozin;

import javax.swing.*;
import java.awt.*;

public class NotesPanel extends JPanel {
    public NotesPanel(int height) {
        this.setPreferredSize(new Dimension(800, height));
        this.setOpaque(false);
    }
}
