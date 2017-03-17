package com.semih.javaeight.functionalProgramming;

import java.util.List;
import java.util.Optional;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AwesomeClassTest {

  private final static Logger LOG = LoggerFactory.getLogger(AwesomeClassTest.class);

  @Test
  public void testInvert() {
    Assert.assertEquals(new Integer(-5), AwesomeClass.invertTheNumber());
  }

  @Test
  public void testOptional() {
    LOG.info(LOG.getClass().toString());
    List list = OptionalExample.example(); //null elemanları siliyor
    List list2 = OptionalExample.example2(); //null elemanlar yerine sem yazıyor.
    LOG.info(list.toString());
    LOG.info(list2.toString());
  }

  @Test
  public void testStream(){
    StreamExample s = new StreamExample();
    s.stream();
  }
}
