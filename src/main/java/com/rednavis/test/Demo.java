package com.rednavis.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/** The Demo class is responsible for demonstrating application performance */
public class Demo {

  private static final Logger logger = LogManager.getLogger(Demo.class);

  public static void main(String[] args) {

    com.rednavis.test.IntegerHelper helper = new IntegerHelper();
    List<Integer> integers = List.of(10, 1, -3, 8, 9, 3, 2, 1, 11, 22, 13, 6, 9, 4, 2);
    logger.info(helper.getTopTenIntegers(integers));
  }
}
