package com.tactfactory.designpatternniveau1.adapter.tp1.model;

public class Mp4Player implements MediaPlayer {

	public void play(String audioType, String fileName) {

	    if (audioType.equalsIgnoreCase("mp4")) {
	      System.out.println("Playing mp4 file. Name: " + fileName);
	    }
	  }
}
