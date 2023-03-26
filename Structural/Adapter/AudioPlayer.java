package DesignPatterns.Structural.Adapter;

public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("playing mp3..." + fileName);
        } else if(audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Not supported");
        }
    }
}
