# Inner 3

Inside the Solution class:
1) implement a private class TaskDataProvider using Task and MockDB, the purpose of which is to update the tasks field.
2) implement a private class NameDataProvider using String and MockDB whose purpose is to update the names field.


## Requirements:
1. The TaskDataProvider class must be created inside the Solution class and be private.
2. The NameDataProvider class must be created inside the Solution class and be private.
3. The TaskDataProvider class must implement the DbDataProvider interface with a Task type 		parameter.
4. The NameDataProvider class must implement the DbDataProvider interface with a String type 	parameter.
5. The refreshAllData method in the TaskDataProvider class must save the result of the work of 	the getFakeTasks method of the MockDB class to the tasks list.
6. The refreshAllData method in the NameDataProvider class must save the result of the work of t	he getFakeNames method of the MockDB class to the names list.