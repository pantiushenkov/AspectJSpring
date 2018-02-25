package com.aspectexample.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aspectexample.user.User;

public class App {
	public static void main(String[] args) throws Exception {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("AspectExample.xml");

		User user = (User) appContext.getBean("user");
		String playlistName = "Lana del Rey"; 

		user.createPlaylist(playlistName);
		user.playlistReturnValue();
		user.createPlaylistAround(playlistName);

		//user.throwPlaylistExist();
	
	}
}