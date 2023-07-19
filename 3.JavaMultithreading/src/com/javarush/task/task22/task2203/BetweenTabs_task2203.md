# Between tabs

The getPartOfString method must return the substring between the first and second tabs.
Throw a TooShortStringException on incorrect data.
Do not change the TooShortStringException class.


## Requirements:
1. The TooShortStringException class must be a descendant of the Exception class.
2. The getPartOfString method must take a string as a parameter.
3. If the string passed to the getPartOfString method contains less than 2 tabs, a TooShortStringException should be thrown.
4. The getPartOfString method must return a substring between the first and second tabs.