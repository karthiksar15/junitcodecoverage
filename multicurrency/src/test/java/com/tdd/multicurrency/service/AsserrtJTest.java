package com.tdd.multicurrency.service;

import org.junit.jupiter.api.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

public class AsserrtJTest {

    @Test
    public void learn() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        assertThat(numbers).hasSize(3).contains(2);
        DocumentContext context = JsonPath.parse("[{id:1},{id:2},{id:3}]");

    }

}
