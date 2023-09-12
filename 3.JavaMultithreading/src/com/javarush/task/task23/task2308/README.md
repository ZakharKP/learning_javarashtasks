# Refactoring, nested classes

Refactor the Solution class: move all constants to the public nested Constants class.
Don't inherit from Constants.


## Requirements:
1. In the Solution class, the Constants class must be created containing string constants.
2. The Constants class must be public.
3. The Constants class must be declared with a modifier that prohibits inheritance 
	from this class.
4. The Constants class must have a SERVER_IS_CURRENTLY_NOT_ACCESSIBLE constant with 
	the value "The server is not currently accessible."
5. The Constants class must have a USER_IS_NOT_AUTHORIZED constant with the value 
	"The user is not authorized."
6. The Constants class must have a USER_IS_BANNED constant with the value 
	"The user is banned."
7. The Constants class must have an ACCESS_IS_DENIED constant with the value 
	"Access is denied."