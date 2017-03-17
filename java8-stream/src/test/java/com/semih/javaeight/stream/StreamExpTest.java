package com.semih.javaeight.stream;

import java.util.Random;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamExpTest {

  private final static Logger LOG = LoggerFactory.getLogger(StreamExpTest.class);

  @Test
  public void testStream() {
    StreamExp streamExp = new StreamExp();
    streamExp.streamExample();
  }

  @Test
  public void forEachExample() {
    Random rand = new Random();
    rand.ints().limit(2).forEach(a -> LOG.info(String.valueOf(a)));
  }
}
