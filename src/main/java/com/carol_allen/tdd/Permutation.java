package com.carol_allen.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static List<String> getPermutationResult(String input) {


        if(input.length()>1){
            List<String> result = new ArrayList<>();

            for(int i =0;i<input.length();i++){
                List<String> permutationResult = getPermutationResult(removeOneChar(input, i));
                for(int j = 0;j<permutationResult.size();j++){
                    result.add(input.charAt(i) +getPermutationResult(removeOneChar(input,i)).get(j));
                }
            }
            return result;
        }
        return Arrays.asList(input);
    }

    private static String removeOneChar(String input,int index) {
        return input.substring(0, index) + input.substring(index+1);
    }
}
