package com.education.dao;

public interface UserDao {
   void addUser(User user);
   void login(String acct_id,String password);
}
