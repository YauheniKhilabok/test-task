package com.rednavis.test;

import com.rednavis.test.impl.IntegerHelperImpl;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        IntegerHelper helper = new IntegerHelperImpl();
        List<Integer> integers = Arrays.asList(10, 1, -3, 8, 9, 3, 2, 1, 11, 22, 13, 6, 9, 4, 2);
        System.out.println(helper.getTopTenIntegers(integers));
    }
}
