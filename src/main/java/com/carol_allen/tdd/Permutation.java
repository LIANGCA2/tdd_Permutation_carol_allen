package com.carol_allen.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    private static  final String nullPointMessage = "Should input not null";

    public static List<String> getPermutationResult(String input) {

            if(input==""){
                throw new NullPointerException(nullPointMessage);
            }
            if(input.length()==1){
                return Arrays.asList(input);
            }

            List<String> result = new ArrayList<>();

            for(int i =0;i<input.length();i++){
                List<String> permutationResult = getPermutationResult(removeOneChar(input, i));
                for(int j = 0;j<permutationResult.size();j++){
                    result.add(input.charAt(i) +getPermutationResult(removeOneChar(input,i)).get(j));
                }
            }
            return result;

    }

    private static String removeOneChar(String input,int index) {
        return input.substring(0, index) + input.substring(index+1);
    }
}
