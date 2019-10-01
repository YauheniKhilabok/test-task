package com.rednavis.test.impl;

import com.rednavis.test.IntegerHelper;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerHelperImpl implements IntegerHelper {

    @Override
    public List<Integer> getTopTenIntegers(List<Integer> integers) {

        if (integers == null || integers.isEmpty()) {
            return Collections.emptyList();
        }

        return integers.stream()
                .sorted(Collections.reverseOrder())
                .limit(INTEGERS_LIMIT)
                .collect(Collectors.toList());
    }
}
