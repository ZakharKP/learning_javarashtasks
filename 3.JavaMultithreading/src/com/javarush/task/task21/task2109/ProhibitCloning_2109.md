# Prohibit cloning

Allow to clone class A
Prohibit clone class B
Allow to clone class C
Don't forget the equals and hashCode methods!


## Requirements:
1. Class A must support the Cloneable interface.
2. Class B must be a descendant of class A.
3. When declaring class B, implements Cloneable must not be explicitly specified.
4. The clone method in class B must be overridden in such a way that an attempt to clone an object of class B throws a 				CloneNotSupportedException.
5. Class C must be a descendant of class B.
6. Cloning of class C objects should succeed.