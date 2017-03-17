package com.semih.javaeight.dateAPI;

import java.util.function.Function;
import org.junit.Test;

public class DateTest {

  @Test
  public void testDateAPI() {
    DateAPI dateAPI = new DateAPI();
    dateAPI.dateAPIEx();
  }

  @Test
  public void testX() {
    Function<Integer, Integer> function = x -> x + 1;
    System.out.println(function.apply(4));
  }

}
