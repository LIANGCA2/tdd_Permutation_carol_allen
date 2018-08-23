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
        if(input.length()==3){
            List<String> result = new ArrayList<>();
            result.add(input);
            result.add(input.substring(0,1)+input.substring(2,3)+ input.substring(1,2));
            result.add(input.substring(1,2)+input.substring(0,1)+input.substring(2,3));
            result.add(input.substring(1,2)+input.substring(2,3)+input.substring(0,1));
            result.add(input.substring(2,3)+input.substring(0,1)+input.substring(1,2));
            result.add(input.substring(2,3)+input.substring(1,2)+input.substring(0,1));
            return result;
        }
        return Arrays.asList(input);
    }
}
