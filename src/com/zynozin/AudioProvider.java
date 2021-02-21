package com.zynozin;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AudioProvider {
    private File file;
    private AudioInputStream audioInputStream;
    Clip clip;

    public void makeSound(String path) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        file = new File(path);
        audioInputStream = AudioSystem.getAudioInputStream(file);
        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();

    }
}
