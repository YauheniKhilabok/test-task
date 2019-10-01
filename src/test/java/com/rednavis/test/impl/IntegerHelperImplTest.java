package com.rednavis.test.impl;

import com.rednavis.test.IntegerHelper;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class IntegerHelperImplTest {

    private IntegerHelper integerHelper;

    @Before
    public void setUp() {
        integerHelper = new IntegerHelperImpl();
    }

    @Test
    public void getTopTenIntegers_integersAreNull_emptyIntegers() {
        //given
        List<Integer> expectedIntegers = Collections.emptyList();
        //when
        List<Integer> actualIntegers = integerHelper.getTopTenIntegers(null);
        //then
        assertEquals(expectedIntegers, actualIntegers);
    }

    @Test
    public void getTopTenIntegers_integersAreEmpty_emptyIntegers() {
        //given
        List<Integer> integers = Collections.emptyList();
        List<Integer> expectedIntegers = Collections.emptyList();
        //when
        List<Integer> actualIntegers = integerHelper.getTopTenIntegers(integers);
        //then
        assertEquals(expectedIntegers, actualIntegers);
    }

    @Test
    public void getTopTenIntegers_predefinedIntegers_sizeEqualsTen() {
        //given
        List<Integer> integers = getPredefinedIntegers();
        //when
        List<Integer> actualIntegers = integerHelper.getTopTenIntegers(integers);
        //then
        assertEquals(IntegerHelper.INTEGERS_LIMIT, actualIntegers.size());
    }

    @Test
    public void getTopTenIntegers_predefinedIntegers_expectedEqualsActual() {
        //given
        List<Integer> integers = getPredefinedIntegers();
        List<Integer> expectedIntegers = getExpectedTopTenFromPredefinedIntegers();
        //when
        List<Integer> actualIntegers = integerHelper.getTopTenIntegers(integers);
        //then
        assertEquals(expectedIntegers, actualIntegers);
    }

    @Test
    public void getTopTenIntegers_millionIntegers_expectedEqualsActual() {
        //given
        List<Integer> integers = getMillionIntegers();
        List<Integer> expectedIntegers = getExpectedTopTenFromMillionIntegers();
        //when
        List<Integer> actualIntegers = integerHelper.getTopTenIntegers(integers);
        //then
        assertEquals(expectedIntegers, actualIntegers);
    }

    private static List<Integer> getPredefinedIntegers() {
        return Arrays.asList(-20, -18, -16, -14, -12, -10, -8, -6, -4, -2, 0, 2, 4, 6, 8, 10, 12, 14, 16, 18);
    }

    private static List<Integer> getExpectedTopTenFromPredefinedIntegers() {
        return Arrays.asList(18, 16, 14, 12, 10, 8, 6, 4, 2, 0);
    }

    private static List<Integer> getMillionIntegers() {
        return Stream.iterate(0, i -> i + 1)
                .limit(100_000_00)
                .collect(Collectors.toList());
    }

    private static List<Integer> getExpectedTopTenFromMillionIntegers() {
        return Arrays.asList(99_999_99, 99_999_98, 99_999_97, 99_999_96, 99_999_95, 99_999_94, 99_999_93, 99_999_92,
                99_999_91, 99_999_90);
    }
}
