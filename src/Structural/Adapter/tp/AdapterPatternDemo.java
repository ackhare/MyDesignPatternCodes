package Structural.Adapter.tp;

import Structural.Adapter.tp.ConcreteMediaPlayer.AudioPlayer;

/**
 * Created by chetan on 12/11/16.
 */

//Use the AudioPlayer to play different types of audio formats.

public class AdapterPatternDemo {
   public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();
//its format and file name arguments
      audioPlayer.play("mp3", "beyond the horizon.mp3");
      audioPlayer.play("mp4", "alone.mp4");
      audioPlayer.play("vlc", "far far away.vlc");
      audioPlayer.play("avi", "mind me.avi");
   }
}
/*
Playing mp3 file. Name: beyond the horizon.mp3
Playing mp4 file. Name: alone.mp4
Playing vlc file. Name: far far away.vlc
Invalid media. avi format not supported
 */