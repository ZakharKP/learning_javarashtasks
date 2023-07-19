package com.javarush.bigtask.task36.task3608;

import com.javarush.bigtask.task36.task3608.controller.Controller;
import com.javarush.bigtask.task36.task3608.model.MainModel;
import com.javarush.bigtask.task36.task3608.model.Model;
import com.javarush.bigtask.task36.task3608.view.EditUserView;
import com.javarush.bigtask.task36.task3608.view.UsersView;

public class Solution {
	public static void main(String[] args) {
		Model model = new MainModel();
		UsersView usersView = new UsersView();
		EditUserView editUserView = new EditUserView();
		Controller controller = new Controller();

		usersView.setController(controller);
		controller.setModel(model);
		controller.setUsersView(usersView);
		controller.setEditUserView(editUserView);
		editUserView.setController(controller);

		usersView.fireEventShowAllUsers();
		usersView.fireEventOpenUserEditForm(126);
		editUserView.fireEventUserDeleted(124L);
		editUserView.fireEventUserChanged("NIKO", 126, 3);
		usersView.fireEventShowDeletedUsers();
	}
}