package adapter.player;

/**
 * Created by helmeter on 5/3/16.
 */
public class Mp4Player implements AdvancedMediaPlayer {

    public void playVlc(String fileName) {
        //什么也不做
    }


    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
