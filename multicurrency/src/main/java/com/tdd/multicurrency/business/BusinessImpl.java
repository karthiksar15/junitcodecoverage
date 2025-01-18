package com.tdd.multicurrency.business;

import java.util.Arrays;

import com.tdd.multicurrency.service.SomeDataService;
import com.tdd.multicurrency.service.SomeDataServiceImpl;

public class BusinessImpl {

    private SomeDataService someDataService;

    public BusinessImpl(SomeDataService SomeDataService) {
        this.someDataService = new SomeDataServiceImpl();
    }

    public int calculateSum(int[] data) {
        int sum = Arrays.stream(data).sum();
        return sum;
    }

    public int calculateSumUsingSomeDataService() {
        int[] data = someDataService.retrieveAllData();
        int sum = Arrays.stream(data).sum();
        return sum;
    }

}
