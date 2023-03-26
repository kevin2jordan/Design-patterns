package DesignPatterns.Structural.Adapter;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        System.out.println("Vlc player mp4");
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("VLc player vlc");
    }
}
