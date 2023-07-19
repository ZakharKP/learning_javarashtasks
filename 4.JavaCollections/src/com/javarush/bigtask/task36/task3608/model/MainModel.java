package com.javarush.bigtask.task36.task3608.model;

import java.util.List;

import com.javarush.bigtask.task36.task3608.bean.User;
import com.javarush.bigtask.task36.task3608.model.service.UserService;
import com.javarush.bigtask.task36.task3608.model.service.UserServiceImpl;

public class MainModel implements Model {
	private ModelData modelData = new ModelData();
	private UserService userService = new UserServiceImpl();

	private List<User> getAllUsers() {
		List<User> users = userService.getUsersBetweenLevels(1, 100);
		return userService.filterOnlyActiveUsers(users);
	}

	@Override
	public ModelData getModelData() {
		return this.modelData;
	}

	public void loadUsers() {
		// List<User> users = userService.getUsersBetweenLevels(1, 100);

		modelData.setUsers(getAllUsers());
		modelData.setDisplayDeletedUserList(false);
	}

	public void loadDeletedUsers() {
		try {
			List<User> users = userService.getAllDeletedUsers();
			modelData.setUsers(users);
			modelData.setDisplayDeletedUserList(true);
		} catch (UnsupportedOperationException unsupportedOperationException) {
			throw unsupportedOperationException;
		}
	}

	@Override
	public void deleteUserById(long id) {
		userService.deleteUser(id);
		modelData.setUsers(getAllUsers());
	}

	@Override
	public void changeUserData(String name, long id, int level) {
		userService.createOrUpdateUser(name, id, level);
		modelData.setUsers(getAllUsers());
	}

	public void loadUserById(long userId) {
		User user = userService.getUsersById(userId);
		modelData.setActiveUser(user);
	}
}
