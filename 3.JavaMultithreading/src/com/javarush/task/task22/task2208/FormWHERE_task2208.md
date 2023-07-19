# We form WHERE

Build the WHERE part of the query using StringBuilder.
If the value is null, then the parameter should not be included in the request.
Example:
{name=Ivanov, country=Ukraine, city=Kiev, age=null}
Result:
name = &#39;Ivanov&#39; and country = &#39;Ukraine&#39; and city = &#39;Kiev&#39;


## Requirements:

1. The getQuery method must take one parameter of type Map.
2. The getQuery method must have a String return type.
3. The getQuery method must be static.
4. The getQuery method must return a string formed according to the rules described in the problem statement.