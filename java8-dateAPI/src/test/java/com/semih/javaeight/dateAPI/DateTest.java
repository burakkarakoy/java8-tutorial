package com.semih.javaeight.dateAPI;

import java.util.function.Function;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateTest {

  private final static Logger LOG = LoggerFactory.getLogger(DateTest.class);

  @Test
  public void testDateAPI() {
    DateAPI dateAPI = new DateAPI();
    dateAPI.dateAPIEx();
  }

  @Test
  public void testX() {
    Function<Integer, Integer> function = x -> x + 1;
    LOG.info(function.apply(4).toString());
  }
}
