package com.confiz.adapter.pattern;

public class AudioPlayer implements ITarget {

	ITarget adapter;

	public AudioPlayer(ITarget adapter) {
		this.adapter = adapter;
	}

	@Override
	public void play(String AudioType) {
		if ("mp3".equalsIgnoreCase(AudioType)) {
			System.out.println("Playing mp3 media...");
		} else if ("mp4".equalsIgnoreCase(AudioType)) {
			adapter.play(AudioType);
		} else {
			System.out.println("Invalid media type");
		}
	}

}
