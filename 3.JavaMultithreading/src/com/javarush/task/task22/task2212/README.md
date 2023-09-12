# Phone number verification

The checkTelNumber method must check if the telNumber argument is a valid phone number.
Validity Criteria:
1) if the number starts with &#39;+&#39;, then it contains 12 digits
2) if the number starts with a digit or an opening bracket, then it contains 10 digits
3) can contain 0-2 characters &#39;-&#39;, which cannot be consecutive
4) can contain 1 pair of brackets &#39;(&#39; and &#39;)&#39; , and if it is, then it is located to the left of 
the signs &#39;-&#39;
5) brackets inside clearly contain 3 digits
6) the number does not contain letters
7) the number ends with a number

Examples:
+380501234567 - true
+38(050)1234567 - true
+38050123-45-67 - true
050123-4567 - true

+38)050(1234567 - false
+38(050)1-23-45-6-7 - false
050xxx4567 - false
050123456 - false
(0)501234567 - false


## Requirements:
1. The checkTelNumber method must return a boolean value.
2. The checkTelNumber method must be public.
3. The checkTelNumber method must take one String type parameter.
4. The checkTelNumber method must correctly check the validity of the phone number passed to it as a parameter.