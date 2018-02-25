package com.aspectexample.user;

public interface User {

	void createPlaylist(String playlistName);
	
	String playlistReturnValue();
	
	void throwPlaylistExist() throws Exception;
	
	void createPlaylistAround(String playlistName);
}