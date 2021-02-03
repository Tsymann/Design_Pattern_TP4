package com.tactfactory.designpatternniveau1.adapter.tp1.model;

import com.tactfactory.designpatternniveau1.adapter.tp1.*;

public class AudioPlayer implements MediaPlayer{

  public void play(String audioType, String fileName) {

    if (audioType.equalsIgnoreCase("mp3")) {
      System.out.println("Playing mp3 file. Name: " + fileName);
      
    } else if (audioType.equalsIgnoreCase("mp4")) {
    	MediaAdapter adapter = new MediaAdapter(audioType);
    	adapter.play(audioType, fileName);
    	
    } else if (audioType.equalsIgnoreCase("vlc")) {
    	MediaAdapter adapter = new MediaAdapter(audioType);
    	adapter.play(audioType, fileName);
    	
    } else {
    	System.out.println("Invalid media. " + audioType + " format not supported");
    }
  }
}
