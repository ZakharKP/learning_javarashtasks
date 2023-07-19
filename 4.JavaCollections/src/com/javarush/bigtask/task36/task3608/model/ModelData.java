package com.javarush.bigtask.task36.task3608.model;

import java.util.List;

import com.javarush.bigtask.task36.task3608.bean.User;

public class ModelData {
	private User activeUser;
	private List<User> users;
	private boolean displayDeletedUserList;

	private boolean displayEditedUser;

	public void setDisplayEditedUser(boolean displayEditedUser) {
		this.displayEditedUser = displayEditedUser;
	}

	public boolean isDisplayDeletedUserList() {
		return displayDeletedUserList;
	}

	public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
		this.displayDeletedUserList = displayDeletedUserList;
	}

	public User getActiveUser() {
		return activeUser;
	}

	public void setActiveUser(User activeUser) {
		this.activeUser = activeUser;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
