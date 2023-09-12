# Task 3005
# Such clever exceptions!

Fix the implementation of the checkAFlag method so that it doesn't throw exceptions in all cases.
Save the output logic.
The main method is not involved in testing.


## Requirements:
1. In the checkAFlag method, there should be a check that d, which came as a parameter, is not null. 
	Otherwise the output is "Oops!".
2. In the checkAFlag method there should be a check that d.cs is not null. Otherwise the output is "Oops!".
3. In the checkAFlag method there should be a check that d.cs contains at least one element. Otherwise the output is "Oops!".
4. In the checkAFlag method there should be a check that d.cs.get(0).bs is not null. Otherwise the output is "Oops!".
5. The checkAFlag method should check that d.cs.get(0).bs contains at least one element. Otherwise the output is "Oops!".
6. The checkAFlag method should check that d.cs.get(0).bs.get(0).as is not null. Otherwise the output is "Oops!".
7. The checkAFlag method must contain a check that d.cs.get(0).bs.get(0).as contains at least one element. 
	Otherwise the output is "Oops!".
8. The checkAFlag method should check that d.cs.get(0).bs.get(0).as.get(0).flag is true. Otherwise the output is "Oops!".