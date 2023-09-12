# Online store selling jeans

1. Create 2 interfaces in separate files:
1.1) Item with methods int getId(), double getPrice(), String getTM()
1.2) Jeans extends Item with int getLength() and int getSize() methods

2. In the Util class, in the getAllJeans method, add the missing part of the java code:
2.1) understand what is already in the getAllJeans method of the Util class
2.2) create abstract class AbstractJeans from Jeans interface with one abstract method, implement other methods
2.3) create Levis and Denim classes from AbstractJeans, implement the remaining method
2.4) in the AbstractJeans class, implement the toString() method (you can use Alt+Insert -&gt; toString())
2.5) the toString method of the AbstractJeans class must start with the name of the subclass, for example, Levis{id=1, length=34, size=6, price=150.0}


## Requirements:
1. The Item interface must be created in a separate file.
2. The Jeans interface must extend the Item interface and be created in a separate file.
3. The Item interface must contain all the methods listed in the condition.
4. The Jeans class must contain all the methods listed in the condition.
5. In the getAllJeans method of the Util class, a local AbstractJeans 
	abstract class that supports the Jeans interface must be created.
6. In the getAllJeans method of the Util class, a local Levis class must 
	be created, inherited from the AbstractJeans class.
7. In the getAllJeans method of the Util class, a local Denim class 
	inherited from the AbstractJeans class must be created.
8. The AbstractJeans class must implement a toString() method that starts 
	with the name of the subclass.