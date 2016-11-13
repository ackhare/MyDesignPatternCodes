package Structural.Adapter.tp;

import Structural.Adapter.tp.AdvancedMediaPlayerConcrete.Mp4Player;
import Structural.Adapter.tp.AdvancedMediaPlayerConcrete.VlcPlayer;

/**
 * Created by chetan on 12/11/16.
 */

//Create adapter class implementing the MediaPlayer interface.

public class MediaAdapter implements MediaPlayer {
//Here media adapter implements the same class as audioplayer did
   AdvancedMediaPlayer advancedMusicPlayer;
//Here though media adapter is a layer between advancedmediaPlayer and normal mediaplayer abstractions
   public MediaAdapter(String audioType){

      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();
//as advancedMusicPlayer is an interface can be changed at run timer
      }else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }
   }

   @Override
   public void play(String audioType, String fileName) {

      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}
