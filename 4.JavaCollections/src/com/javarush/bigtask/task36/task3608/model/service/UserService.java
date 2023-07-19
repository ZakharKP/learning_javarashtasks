package com.javarush.bigtask.task36.task3608.model.service;

import java.util.List;

import com.javarush.bigtask.task36.task3608.bean.User;

public interface UserService {
	public User deleteUser(long id);

	public User createOrUpdateUser(String name, long id, int level);

	public List<User> getUsersByName(String name);

	public List<User> getAllDeletedUsers();

	public List<User> getUsersBetweenLevels(int fromLevel, int toLevel);

	List<User> filterOnlyActiveUsers(List<User> allUsers);

	User getUsersById(long userId);
}