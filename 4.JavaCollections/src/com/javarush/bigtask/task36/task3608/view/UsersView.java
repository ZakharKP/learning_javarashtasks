package com.javarush.bigtask.task36.task3608.view;

import java.util.List;

import com.javarush.bigtask.task36.task3608.bean.User;
import com.javarush.bigtask.task36.task3608.controller.Controller;
import com.javarush.bigtask.task36.task3608.model.ModelData;

public class UsersView implements View {
	private Controller controller;

	@Override
	public void refresh(ModelData modelData) {
		if (!modelData.isDisplayDeletedUserList()) {
			System.out.println("All users:");
		} else {
			System.out.println("All deleted users:");
		}
		List<User> users = modelData.getUsers();
		for (User user : users) {
			System.out.println("\t" + user.toString());
		}
		System.out.println("===================================================");
	}

	public void fireEventOpenUserEditForm(long id) {
		controller.onOpenUserEditForm(id);
	}

	public void fireEventShowAllUsers() {
		controller.onShowAllUsers();
	}

	@Override
	public void setController(Controller controller) {
		this.controller = controller;
	}

	public void fireEventShowDeletedUsers() {
		controller.onShowAllDeletedUsers();
	}

}
