package com.education.service;
public interface UserService {
	void addUser(User user);
	void login(String acc_id,String password);
}