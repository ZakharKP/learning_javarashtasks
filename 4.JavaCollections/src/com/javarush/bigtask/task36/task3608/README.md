# Task 3608
# MVC

## MVC (4)

It's time to replace our fake Model with a real one that will receive data from the DataSource.
I added a service for working with users to the model.service package.
Also at the root of this task you will find the utility class Util.

1. Similar to FakeModel, create a MainModel.

2. Because The model accesses the services, then in the MainModel create the UserService userService field, initialize it with an object.

3. Implement the logic of the loadUsers method:
3.1. Get all users between 1 and 100 levels. (Method getUsersBetweenLevels(1, 100)).
3.2. Put all users in modelData.

4. Update Solution.main: replace FakeModel with MainModel.
The advantage of MVC is that any part of the pattern can be easily replaced at any time.

## MVC (5)

The service has a method that returns all remote users. Let's display them.

1. Distribute methods across MVC classes:

public void fireEventShowDeletedUsers() {
...onShowAllDeletedUsers();
}

public void onShowAllDeletedUsers() {
...loadDeletedUsers();
}

public void loadDeletedUsers() {
List&lt;User&gt; users = userService.getAllDeletedUsers();
}

Do not forget that the data received from the server must be put in ModelData. And then update view.
Add it yourself to the necessary methods.

2. Add a call to the new method that you placed in the view to Solution.main.

3. Add the method that you placed in the Model to the Model interface, implement it in FakeModel: throw an UnsupportedOperationException.

## MVC (6)

There is a functionality for displaying remote users, but there are no such users themselves. Let's fix this.
Let's make a new View - EditUserView, which will be responsible for editing one specific user.
UsersView displays a list of users.
The EditUserView will display the edit data of a specific user.
To do this, we first need this selected user.
Like any data, we put it in ModelData.

1. Create a User activeUser field in ModelData with a getter and setter (Alt+Insert -&gt; Getter and Setter).

2. Similarly to UsersView create EditUserView.
Refresh method logic:
2.1. Output "User to be edited:" to the console.
2.2. On a new line, output a tab and the active user.
2.3. On a new line, print the delimiter &quot;========================================== ========&quot;.

3. Create an EditUserView editUserView field with a setter in the controller.

When our data is displayed in the console, it is not at all clear which users - remote or not - are listed.
Let's make Vue display this information. All display data is stored in the Model. That's why:
4. create in ModelData field boolean displayDeletedUserList with getter and setter.

5. Change the refresh method in UsersView so that it is from
displayed "All users:" or "All deleted users:"
depending on which users are in the list. Add the displayDeletedUserList change to the required model methods.

## MVC (7)

1. Distribute methods across MVC classes:

public void onOpenUserEditForm(long userId) {
...loadUserById(userId);
...refresh(...getModelData());
}

public void fireEventOpenUserEditForm(long id) {
...onOpenUserEditForm(id);
}

public void loadUserById(long userId) {
User user = userService.getUsersById(userId);
...setActiveUser(user);
}

!!!! The user sees a View with a list of users, clicks on one of them, the request goes to the server,
we rake out the new data and display another View, which refers to one selected user.
Keep this in mind when completing this assignment.

2. Add to the main method opening the edit form for the user with id=126 before calling the fireEventShowDeletedUsers() method.

3. Add the method that you placed in the Model to the Model interface, implement it in FakeModel: throw an UnsupportedOperationException.

## MVC(8)

1. Following the MVC principle, similarly to the implementation of the previous methods, do the following:
write the logic for deleting a user. After deletion, a list of users should be displayed.
Distribute the following methods among the MVC classes:
public void fireEventUserDeleted(long id)
public void onUserDelete(long id)
public void deleteUserById(long id)
Note: the method you are going to add to the View needs to be added to the EditUserView.

2. Add a call to main to fireEventUserDeleted(124L) before calling the fireEventShowDeletedUsers() method.

3. Refactor the MainModel class. Now that there are remote users, some of the methods began to work incorrectly.
In almost all methods that require a list of users, you only need to work with active (live) users.
Move it to a separate private method List&lt;User&gt; getAllUsers() get a list of all active users.
You already have active user filtering - List&lt;User&gt; filterOnlyActiveUsers(List&lt;User&gt; allUsers).
Refactor all methods that use the list of users. They must use a list of live users.

4. Add the method that you placed in the Model to the Model interface, implement it in FakeModel: throw an UnsupportedOperationException.

## MVC (9)

This is the last MVC assignment.

1. Following the MVC principle, similarly to the implementation of the previous methods, do the following:
write the user update logic. After the update, a list of users should be displayed.
Distribute the following methods among the MVC classes:
public void fireEventUserChanged(String name, long id, int level)
public void onUserChange(String name, long id, int level)
public void changeUserData(String name, long id, int level)
where name and level are the new values for the user with the selected id.
Note: the method you are going to add to the View needs to be added to the EditUserView.

2. Add a call to main to fireEventUserChanged before calling the fireEventShowDeletedUsers() method.

3. Add the method that you placed in the Model to the Model interface, implement it in FakeModel: throw an UnsupportedOperationException.


Requirements:
1. You need to determine the correct location of the fireEventUserChanged(String name, long id, int level) method and implement this method.
2. It is necessary to determine the correct location of the onUserChange(String name, long id, int level) method and implement this method.
3. You must determine the correct location of the void changeUserData(String name, long id, int level) method and implement this method.
4. In the main method, you must call the fireEventUserChanged(String, long, int) method before calling the fireEventShowDeletedUsers() method.
5. The Model interface must contain the declaration of the method that you previously implemented in the MainModel class.
6. In the FakeModel class, in the body of the method placed in the Model interface, you must throw an UnsupportedOperationException.

