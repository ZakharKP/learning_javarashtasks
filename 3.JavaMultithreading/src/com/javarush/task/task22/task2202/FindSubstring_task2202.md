# Find substring

The getPartOfString method must return a substring starting from the character after the 1st space and up to 
the end of the word, which comes after the 4th space.
Example: "JavaRush is the best Java learning service."
Result: "- the best training service"
Example: "Amigo and Diego are best friends!"
Result: "and Diego are best friends!"
Throw TooShortStringException (make an exception) for incorrect data.


## Requirements:
1. The TooShortStringException class must be a descendant of the RuntimeException class.
2. The getPartOfString method must take a string as a parameter.
3. If incorrect data was passed to the getPartOfString method, a TooShortStringException should be thrown.
4. The getPartOfString method must return a substring starting from the character after the 1st 
	space and up to the end of the word following the 4th space.