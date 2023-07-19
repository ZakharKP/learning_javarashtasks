package com.javarush.task.task22.task2205;

public class Solution {
    public static void main(String[] args) {
    	// must be "I like JavaRush course"
        System.out.println(String.format(getFormattedString(), "JavaRush", "course", "I", "like"));
        
    }

    public static String getFormattedString() {
        return "%3$S %4$s %1$s %2$s";
    }
}
