package Structural.Adapter.tp.AdvancedMediaPlayerConcrete;

import Structural.Adapter.tp.AdvancedMediaPlayer;

/**
 * Created by chetan on 12/11/16.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
   @Override
   public void playVlc(String fileName) {
      System.out.println("Playing vlc file. Name: "+ fileName);
   }

   @Override
   public void playMp4(String fileName) {
      //do nothing
   }
}
