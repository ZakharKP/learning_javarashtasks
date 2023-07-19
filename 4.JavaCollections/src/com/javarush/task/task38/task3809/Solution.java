package com.javarush.task.task38.task3809;

/* 
Annotation + Reflection
*/

public class Solution {
    public static void main(String[] args) throws IllegalAccessException {
        JavaRushBankAccount account = new JavaRushBankAccount("Mr.Smith");
        System.out.println("Check №1:");
        ReflectionAnnotationUtil.check(account);

        System.out.println("Check №2:");
        account.setAmount(100);
        ReflectionAnnotationUtil.check(account);

        System.out.println("Check №3:");
        ReflectionAnnotationUtil.check(new IncorrectAccount());
/* Expected output:

Check №1:
The field 'amount' in the JavaRushBankAccount class has the annotation 'LongPositive', but its value is not positive.
Check №2:
Check №3:
The field 'amountString' in the IncorrectAccount class has the annotation 'LongPositive', but its type is String.

*/
    }
}
