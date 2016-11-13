package Structural.Adapter.tp.ConcreteMediaPlayer;

import Structural.Adapter.tp.MediaAdapter;
import Structural.Adapter.tp.MediaPlayer;

/**
 * Created by chetan on 12/11/16.
 */
public class AudioPlayer implements MediaPlayer {

   //mediaAdapter is plugged via mediaAdapter
   MediaAdapter mediaAdapter;

   @Override
   public void play(String audioType, String fileName) {
//this code says that format was that it could orignally play or adapter could play then it could play
  //Anything else could not be played
      //inbuilt support to play mp3 music files
      if(audioType.equalsIgnoreCase("mp3")){
         System.out.println("Playing mp3 file. Name: " + fileName);
      }

      //mediaAdapter is providing support to play other file formats
      else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
         mediaAdapter = new MediaAdapter(audioType);
         mediaAdapter.play(audioType, fileName);
      }

      else{
         System.out.println("Invalid media. " + audioType + " format not supported");
      }
   }
}