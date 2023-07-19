# Task 3611
# How many potential friends does a person have?

Today we will consider part of the functionality of social networks. How does the network know what kind of people to offer you in
friends you might know? This problem can be easily solved using graphs.

Your task is to implement the Set&lt;Integer&gt; getAllFriendsAndPotentialFriends(int index, int deep),
which returns indexes of people that you already have as friends and that you may know. After that
will execute the removeFriendsFromSet method, and the result of this method is all the potential friends of the person with
index index and search depth deep.
For simplicity, we will consider the relationships of all people as a two-dimensional array humanRelationships (see example
array in the generateRelationships method). On the main diagonal, all elements are true, since they are the same
Human. The intersection of the row and column indicates whether people have been added to each other as friends (if true - then
people have each other as friends). If a person with index k is friended by a person with index p, this is
means that the person with index p has a friend with index k.
Two arguments are passed to the method:
int index is the index of the person in the array (starting from zero);
int deep - depth of search for friends. If Masha is friends with Natasha and Masha has Olya as friends, with depth
search = 1, for Natasha, you need to add Masha to the resulting set. If search depth = 2, for Natasha
you need to add Masha to the resulting set and Olya as a potential friend. If search depth = 3,
in the same set, you need to add everyone with whom Olya is friends.
See the example in the main method.
The set returned by the getAllFriendsAndPotentialFriends method must not have an index index.


## Requirements:
1. The Solution class must have a public method Set&lt;Integer&gt; getAllFriendsAndPotentialFriends(int index, int deep).
2. The private boolean'[]''[]' humanRelationships field must be declared in the Solution class.
3. The set returned by the getAllFriendsAndPotentialFriends method must not have an index index.
4. The getAllFriendsAndPotentialFriends method must be implemented according to the condition.