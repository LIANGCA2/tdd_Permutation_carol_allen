package com.carol_allen.tdd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PermutationTest {
    @Test
    public void should_return_a_when_input_a(){
        String input = "a";
        List<String> permutationList = Permutation.getPermutationResult(input);
        assertThat(Arrays.asList(input),is(permutationList));
    }

    @Test
    public void should_return_ab_ba_when_input_ab(){
        String input = "ab";
        List<String> permutationList = Permutation.getPermutationResult(input);
        assertThat(Arrays.asList("ab","ba"),is(permutationList));
    }
}
