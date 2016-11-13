package Structural.Adapter.tp;

/**
 * Created by chetan on 12/11/16.
 */
public interface AdvancedMediaPlayer {
    //As is evident from this file that any class thart extends this would give below behaviours
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
