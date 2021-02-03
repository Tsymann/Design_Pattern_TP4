package com.tactfactory.designpatternniveau1.adapter.tp1;

import com.tactfactory.designpatternniveau1.adapter.tp1.model.*;

public class MediaAdapter implements MediaPlayer{
	
	private MediaPlayer player;
	
	public MediaAdapter(String audioType) {
		if(audioType == "mp3") {
			player = new AudioPlayer();
			
		} else if(audioType == "mp4") {
			player = new Mp4Player();
			
		} else if(audioType == "vlc") {
			player = new VlcPlayer();
			
		}
	}

	
	public void play(String audioType, String fileName) {
		switch (audioType) {
	    case "mp3":
	    	player.play(audioType, fileName);
	      break;

	    case "mp4":
	    	player.play(audioType, fileName);
	      break;
	      
	    case "vlc":
	    	player.play(audioType, fileName);
	    	break;
	    	
	    default:
	    	System.out.println("Invalid media. " + audioType + " format not supported");
	    	break;
	    }
	}
}