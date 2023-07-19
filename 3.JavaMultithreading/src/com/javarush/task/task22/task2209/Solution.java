package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(String.valueOf(fileName.readLine())));
        fileName.close();
        StringBuilder  buffer = new StringBuilder();
        while(fileReader.ready()){
            buffer.append(fileReader.readLine() + " ");
        }
        fileReader.close();
        StringBuilder result = getLine(buffer.toString().split(" "));
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        int i = 0;

        StringBuilder result;
        if(words.length == 0){return new StringBuilder();}
        while(true) {
            int count = words.length;
            result = new StringBuilder();
            result.append(words[i]);
            count--;

            for (int j = 0; j < words.length; j++) {
            	
                char what = result.toString().toLowerCase().charAt(result.length() - 1);
                if (result.toString().lastIndexOf(words[j]) == -1 && what == (words[j].toLowerCase().charAt(0))) {
                
                	result.append(" " + words[j]);
                    count--;
                    j = -1;


                }

            }



            if(count == 0) break;
            else i++;
        }


        return result;
    }
}
