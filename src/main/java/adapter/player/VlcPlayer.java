package adapter.player;

/**
 * Created by helmeter on 5/3/16.
 */
public class VlcPlayer  implements  AdvancedMediaPlayer{
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }


    public void playMp4(String fileName) {
        //什么也不做
    }
}
