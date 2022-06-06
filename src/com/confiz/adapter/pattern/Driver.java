package com.confiz.adapter.pattern;

public class Driver {

	public static void main(String... args) {
		System.out.println("<====================>");
		System.out.println("   Adapter Pattern");
		System.out.println("<====================>");
	
		ITarget adapter = new Adapter(new MP4Player());
		AudioPlayer audioPlayer = new AudioPlayer(adapter);
		audioPlayer.play("mp3");
		
		System.out.println();
		System.out.println("<=========================================================>");
	}
}
