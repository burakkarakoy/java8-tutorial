package com.semih.javaeight.lambda;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FunctionalTest {

  private static final Logger LOG = LoggerFactory.getLogger(FunctionalTest.class);

  @Test
  public void testFunctional() {
    Functional functional = new Functional() {
      @Deprecated
      public String print() {
        return "sem3";
      }
    };
    Functional functional1 = () -> "sem2";

    LOG.info(functional.print());
    LOG.info(functional1.print());
  }
}
