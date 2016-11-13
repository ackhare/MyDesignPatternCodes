package Structural.Adapter.tp.AdvancedMediaPlayerConcrete;

import Structural.Adapter.tp.AdvancedMediaPlayer;

/**
 * Created by chetan on 12/11/16.
 */
public class Mp4Player implements AdvancedMediaPlayer {
//This could have been done by abstract class
   @Override
   public void playVlc(String fileName) {
      //do nothing
   }

   @Override
   public void playMp4(String fileName) {
      System.out.println("Playing mp4 file. Name: "+ fileName);
   }
}
