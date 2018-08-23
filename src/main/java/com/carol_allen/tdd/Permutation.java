package com.carol_allen.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static List<String> getPermutationResult(String input) {


        if(input.length()>1){
            List<String> result = new ArrayList<>();
            if(input.length()==2){
                for(int i =0;i<input.length();i++) {
                    result.add(input.charAt(i) + getPermutationResult(removeOneChar(input, i)).get(0));
                }
                return result;

            }
            for(int i =0;i<input.length();i++){

                result.add(input.charAt(i) +getPermutationResult(removeOneChar(input,i)).get(0));
                result.add(input.charAt(i) +getPermutationResult(removeOneChar(input,i)).get(1));
            }
            return result;
        }
        return Arrays.asList(input);
    }

    private static String removeOneChar(String input,int index) {
        return input.substring(0, index) + input.substring(index+1);
    }
}
