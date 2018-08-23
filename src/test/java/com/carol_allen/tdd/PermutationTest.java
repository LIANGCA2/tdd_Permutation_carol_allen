package com.carol_allen.tdd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.api.Assertions.fail;
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

    @Test
    public void should_return_abc_acb_bac_bca_cab_cba_when_input_abc(){
        String input = "abc";
        List<String> permutationList = Permutation.getPermutationResult(input);
        assertThat(Arrays.asList("abc","acb","bac","bca","cab","cba"),is(permutationList));
    }

    @Test
    public void should_return_24_when_input_abcd(){
        String input = "abcd";
        List<String> permutationList = Permutation.getPermutationResult(input);
        assertThat(24,is(permutationList.size()));
    }

    @Test
    public void should_return_exceptionMessage_when_input_0_char(){
        String input = "";
        try {
            List<String> permutationList = Permutation.getPermutationResult(input);
           fail("Should input not null");

        }catch (NullPointerException e) {
            assertThat("Should input not null", is(e.getMessage()));
        }
    }
}
