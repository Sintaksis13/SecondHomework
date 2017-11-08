package com.epam.lab23.tasks.second;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {

    public static void main(String[] args) {

        String text = "привет а мамамама мамулька привет мамулечка, мамочка мамуля  мамамама да мама  неееет ,мамамама,      мама  мама привет";

        String searchingWord = "мама";
        String regex = "(мама).+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text.toLowerCase());

        int counterOfWords = 0;

        while(!text.isEmpty()){

            while(matcher.matches() == false && text.length() != 0){

                text = text.replaceFirst(text.substring(0,1), "");
                matcher = pattern.matcher(text.toLowerCase());

            }

            while(matcher.matches() == true){

                text = text.replaceFirst(searchingWord.toLowerCase(), "");
                matcher = pattern.matcher(text.toLowerCase());
                counterOfWords++;

            }

        }

        System.out.println("Number of searching words in the text = " + counterOfWords);

    }


}
