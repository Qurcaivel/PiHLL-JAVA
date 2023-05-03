package com.inqognitoo.spring.text;

import org.jetbrains.annotations.NotNull;

public class Text {

    public static boolean isPalindrome(@NotNull String text) throws IllegalArgumentException {
        if(text.isEmpty()){
            throw new IllegalArgumentException("Passing empty string to palindrome check");
        }

        int i = 0;
        int j = text.length() - 1;

        while(i < j){
            if(text.charAt(i) != text.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
