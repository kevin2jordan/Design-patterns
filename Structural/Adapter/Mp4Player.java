package DesignPatterns.Structural.Adapter;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4 player mp4");
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Mp4 player vlc");
    }
}
