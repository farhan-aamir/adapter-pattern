package com.confiz.adapter.pattern;

public class Adapter implements ITarget{

	MP4Player mp4Player;
	
	public Adapter(MP4Player mp4Player) {
		this.mp4Player = mp4Player;
	}
	
	@Override
	public void play(String type) {
		mp4Player.playMP4();
	}
}
