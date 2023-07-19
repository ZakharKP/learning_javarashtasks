# Anonymity is sometimes so nice!

1. In the vo package, create public classes User, Location, Server, Subject, 
	Subscription that inherit from NamedItem
2. In the Solution class, for each class, create your own method that returns 
	a list of class instances.
	
	For example, for the User class, this would be - public List&lt;User&gt; getUsers()
	For the Location class, this would be - public List&lt;Location&gt; getLocation()
	
3. Inside each such method, create an anonymous class from AbstractDbSelectExecutor 
	and call its desired method.
	
	Hint: method body should start like this: return new AbstractDbSelectExecutor

4. Sample output for User and Location:

	Id=5, name=&#39;User-5&#39;, description=Received from executing &#39;SELECT * FROM USER&#39;
	Id=1, name=&#39;Location-1&#39;, description=Received from executing &#39;SELECT * FROM 			LOCATION&#39;

5. Analyze the sample output and form the correct query for all classes.


## Requirements:
1. In the vo package, a public User class must be created, inherited from the NamedItem class.
2. In the vo package, the public class Location, inherited from the NamedItem class, 
	must be created.
3. In the vo package, a public Server class must be created, inherited from the NamedItem class.
4. In the vo package, a public Subject class must be created, inherited from the
	 NamedItem class.
5. In the vo package, a public Subscription class must be created, inherited from 
	the NamedItem class.
6. In the getUsers method, an object of the AbstractDbSelectExecutor class with 
	a User type parameter must be created.
7. In the getLocations method, an object of the AbstractDbSelectExecutor class 
	must be created with a parameter of type Location.
8. In the getServers method, an object of the AbstractDbSelectExecutor class with 
	a Server type parameter must be created.
9. In the getSubjects method, an object of the AbstractDbSelectExecutor class 
	with a parameter of the Subject type must be created.
10. In the getSubscriptions method, an object of the AbstractDbSelectExecutor class 
	with a Subscription type parameter must be created.
11. The getUsers method must return a correct list (according to the task condition).
12. The getLocations method must return a correct list (according to the task condition).
13. The getServers method must return a correct list (according to the task condition).
14. The getSubjects method must return a correct list (according to the task condition).
15. The getSubscriptions method must return a correct list (according to the task condition).