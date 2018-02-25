package com.aspectexample.user.impl;

import com.aspectexample.user.User;

public class UserImpl implements User {
	String playlistName; 

	public void createPlaylist(String _playlistName){
		playlistName = _playlistName;
		System.out.println("creating playlist: " + playlistName);
	}
	
	public String playlistReturnValue(){
		System.out.println("playlistReturnValue() is running");
		return playlistName;
	}
	
	public void throwPlaylistExist() throws Exception {
		System.out.println("throwPlaylistExist() is running");
		throw new Exception("Sorry, this playlist name is already exists");
	}
	
	public void createPlaylistAround(String _playlistName){
		playlistName = _playlistName;
		System.out.println("creating playlist around: " + playlistName);
	}
}