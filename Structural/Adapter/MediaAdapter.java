package DesignPatterns.Structural.Adapter;

public class MediaAdapter implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
       if(audioType.equalsIgnoreCase("vlc")) {
           advancedMediaPlayer.playVlc(fileName);
       } else if(audioType.equalsIgnoreCase("mp4")){
           advancedMediaPlayer.playMp4(fileName);
       }
    }

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }
}
