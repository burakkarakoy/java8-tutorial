package com.semih.javaeight.lambda;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConverterTest {

  private static final Logger LOG = LoggerFactory.getLogger(ConverterTest.class);

  @Test
  public void testConverter() {
    Converter<String, Integer> converter = (conv) -> Integer.valueOf(conv);
    Integer converted = converter.convert("123");
    LOG.info(converted.toString());
    Assert.assertTrue(converted instanceof Integer);
    LOG.info(String.valueOf(converted.getClass()));
  }
}
