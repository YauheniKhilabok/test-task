package com.rednavis.test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/** The IntegerHelper class provides functionality to process integer data. */
public class IntegerHelper {

  // maximum limit of data to be returned
  public static final int INTEGERS_LIMIT = 10;

  /**
   * @param integers - integer values that should be processed
   * @return empty list in case of nullable or empty input collection, otherwise max ten integers
   *     from the input sequence
   */
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
