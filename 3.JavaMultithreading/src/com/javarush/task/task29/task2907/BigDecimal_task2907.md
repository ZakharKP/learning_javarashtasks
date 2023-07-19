# This strange BigDecimal

Fix the implementation error causing the calculation error in the getValue() method.
Do not change the method signature. Do not use rounding.
Read extra. an article about the features of autoboxing.


## Requirements:
1. The getValue() method must create two BigDecimal objects.
2. The getValue() method must call the add() method on the created BigDecimal object.
3. The getValue() method should NOT use the round() method.
4. The getValue() method must return a result without error.