package com.carol_allen.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static List<String> getPermutationResult(String input) {

        if(input.length()==2){
            List<String> result = new ArrayList<>();
            result.add(input);
            result.add(  input.substring(1,2)+input.substring(0,1));
            return result;

        }
        return Arrays.asList(input);
    }
}
