package org.example.class12;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PlayerDemo {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {

        String path="C:\\Users\\Asghar Nazir\\IdeaProjects\\LiveClasses\\src\\main\\java\\org\\example\\class12\\Ambient-music-free.mp3";
        FileInputStream fis=new FileInputStream(path);
        Player p=new Player(fis);
        p.play();



    }
}
